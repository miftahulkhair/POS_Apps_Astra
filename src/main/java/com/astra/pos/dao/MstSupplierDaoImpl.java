package com.astra.pos.dao;

import com.astra.pos.model.MstSupplier;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstSupplierDaoImpl implements MstSupplierDao{
    @Autowired
    EntityManager entityManager;

    @Override
    public void save(MstSupplier mstSupplier) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(mstSupplier);
        session.flush();
    }

    @Override
    public void update(MstSupplier mstSupplier) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(mstSupplier);
        session.flush();
    }

    @Override
    public MstSupplier findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstSupplier.class, id);
    }

    @Override
    public List<MstSupplier> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstSupplier.class).list();
    }

    @Override
    public List<MstSupplier> search(String searchField) {
        Session session = entityManager.unwrap(Session.class).getSession();
        String sql ="SELECT * FROM pos_mst_supplier s WHERE " +
                "LOWER(s.name) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
                "LOWER(s.address) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
                "LOWER(s.phone) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
                "LOWER(s.email) LIKE LOWER(CONCAT('%',:searchTerm, '%'))";
        SQLQuery query = session.createSQLQuery(sql);
        query.setParameter(0,searchField);
        List list = query.list();
        return list;
    }

    @Override
    @Query(value = "SELECT * FROM pos_mst_supplier s WHERE " +
            "LOWER(s.name) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
            "LOWER(s.address) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
            "LOWER(s.phone) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
            "LOWER(s.email) LIKE LOWER(CONCAT('%',:searchTerm, '%'))",
            nativeQuery = true
    )
    public List<MstSupplier> findBySearchTermNative(String searchTerm) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstSupplier.class).list();
    }


}

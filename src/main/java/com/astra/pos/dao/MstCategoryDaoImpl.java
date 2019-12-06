package com.astra.pos.dao;

import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstSupplier;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstCategoryDaoImpl implements MstCategoryDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public void saveUpdate(MstCategory mstCategory) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(mstCategory);
        session.flush();
    }

    @Override
    public MstCategory findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstCategory.class, id);
    }

    @Override
    public List<MstCategory> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstCategory.class).list();
    }
}

package com.astra.pos.dao;

import com.astra.pos.model.MstSupplier;
import com.astra.pos.model.TPr;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PurchaseRequestDaoImpl implements PurchaseRequestDao{
    @Autowired
    EntityManager entityManager;

    @Override
    public void save(TPr tPr) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(tPr);
        session.flush();
    }

    @Override
    public void update(TPr tPr) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(tPr);
        session.flush();
    }

    @Override
    public void saveUpdate(TPr tPr) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(tPr);
        session.flush();
    }

    @Override
    public TPr findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(TPr.class, id);
    }

    @Override
    public List<TPr> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(TPr.class).list();
    }
}

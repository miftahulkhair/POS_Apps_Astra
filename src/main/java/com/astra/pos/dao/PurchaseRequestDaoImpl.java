package com.astra.pos.dao;

import com.astra.pos.model.TPrcsRequest;
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
    public void save(TPrcsRequest tPrcsRequest) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(tPrcsRequest);
        session.flush();
    }

    @Override
    public void update(TPrcsRequest tPrcsRequest) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(tPrcsRequest);
        session.flush();
    }

    @Override
    public void saveUpdate(TPrcsRequest tPrcsRequest) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(tPrcsRequest);
        session.flush();
    }

    @Override
    public TPrcsRequest findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(TPrcsRequest.class, id);
    }

    @Override
    public List<TPrcsRequest> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(TPrcsRequest.class).list();
    }
}

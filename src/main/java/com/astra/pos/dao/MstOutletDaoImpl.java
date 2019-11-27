package com.astra.pos.dao;

import com.astra.pos.model.MstOutlet;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstOutletDaoImpl implements MstOutletDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(MstOutlet mstOutlet) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(mstOutlet);
        session.flush();
    }

    @Override
    public void delete(MstOutlet mstOutlet) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.delete(mstOutlet);
        session.flush();
    }

    @Override
    public void update(MstOutlet mstOutlet) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(mstOutlet);
        session.flush();
    }

    @Override
    public MstOutlet findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstOutlet.class, id);
    }

    @Override
    public List<MstOutlet> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstOutlet.class).list();
    }
}

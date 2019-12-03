package com.astra.pos.dao;

import com.astra.pos.model.AssEmployeeOutlet;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class AssEmployeeOutletDaoImpl implements AssEmployeeOutletDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(AssEmployeeOutlet assEmployeeOutlet) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(assEmployeeOutlet);
        session.flush();
    }

    @Override
    public void delete(AssEmployeeOutlet assEmployeeOutlet) {

        Session session = entityManager.unwrap(Session.class).getSession();
        session.delete(assEmployeeOutlet);
        session.flush();

    }

    @Override
    public void update(AssEmployeeOutlet assEmployeeOutlet) {

        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(assEmployeeOutlet);
        session.flush();

    }

    @Override
    public AssEmployeeOutlet findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(AssEmployeeOutlet.class, id);
    }

    @Override
    public List<AssEmployeeOutlet> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(AssEmployeeOutlet.class).list();
    }
}

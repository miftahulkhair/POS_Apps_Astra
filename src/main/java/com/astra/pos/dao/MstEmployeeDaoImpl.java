package com.astra.pos.dao;

import com.astra.pos.model.MstEmployee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class MstEmployeeDaoImpl implements MstEmployeeDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(MstEmployee mstEmployee) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(mstEmployee);
        session.flush();

    }

    @Override
    public void delete(MstEmployee mstEmployee) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.delete(mstEmployee);
        session.flush();

    }

    @Override
    public void update(MstEmployee mstEmployee) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(mstEmployee);
        session.flush();

    }

    @Override
    public MstEmployee findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstEmployee.class, id);
    }

    @Override
    public List<MstEmployee> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstEmployee.class).list();
    }
}

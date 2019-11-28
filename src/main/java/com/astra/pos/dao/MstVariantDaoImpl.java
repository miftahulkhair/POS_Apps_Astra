package com.astra.pos.dao;

import com.astra.pos.model.MstVariant;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstVariantDaoImpl implements MstVariantDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(MstVariant mstVariant) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(mstVariant);
        session.flush();
    }

    @Override
    public void update(MstVariant mstVariant) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(mstVariant);
        session.flush();
    }

    @Override
    public MstVariant findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstVariant.class, id);
    }

    @Override
    public List<MstVariant> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstVariant.class).list();
    }

}

package com.astra.pos.dao;

import com.astra.pos.model.MstItem;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstItemDaoImpl implements MstItemDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(MstItem mstItem) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(mstItem);
        session.flush();
    }

    @Override
    public void update(MstItem mstItem) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(mstItem);
        session.flush();
    }

    @Override
    public MstItem findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstItem.class, id);
    }

    @Override
    public List<MstItem> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstItem.class).list();
    }
}

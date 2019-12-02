package com.astra.pos.dao;

import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstItemExtDaoImpl implements MstItemExtDao{
    @Autowired
    EntityManager entityManager;

    @Override
    public void saveOrUpdateItem(MstVariant mstVariant) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(mstVariant);
        session.flush();
    }

    @Override
    public void saveOrUpdateVariant(MstItem mstItem) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(mstItem);
        session.flush();
    }

    @Override
    public void saveOrUpdateInvent(AssItemInventory assItemInventory) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(assItemInventory);
        session.flush();
    }

    @Override
    public MstItem findOneItem(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstItem.class, id);
    }

    @Override
    public MstVariant findOneVariant(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstVariant.class, id);
    }

    @Override
    public List<MstVariant> findAllVariant() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstVariant.class).list();
    }

    @Override
    public List<AssItemInventory> findAllInvent() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(AssItemInventory.class).list();
    }
}

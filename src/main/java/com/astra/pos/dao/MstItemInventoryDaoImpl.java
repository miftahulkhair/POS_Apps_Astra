package com.astra.pos.dao;

import com.astra.pos.model.AssItemInventory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstItemInventoryDaoImpl implements MstItemInventoryDao{
    @Autowired
    EntityManager entityManager;

    @Override
    public void saveUpdate(AssItemInventory assItemInventory) {

    }

    @Override
    public AssItemInventory findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(AssItemInventory.class, id);
    }

    @Override
    public List<AssItemInventory> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(AssItemInventory.class).list();
    }
}

package com.astra.pos.dao;

import com.astra.pos.model.MstSupplier;
import com.astra.pos.model.TPrcsOrder;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PurchaseOrderDaoImpl implements PurchaseOrderDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public void update(TPrcsOrder tPrcsOrder) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(tPrcsOrder);
        session.flush();
    }

    @Override
    public TPrcsOrder findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(TPrcsOrder.class, id);
    }

    @Override
    public List<TPrcsOrder> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(TPrcsOrder.class).list();
    }
}

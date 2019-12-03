package com.astra.pos.dao;

import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstItemExtDaoImpl implements MstItemExtDao {

    @Autowired
    EntityManager entityManager;

    @Override
    public void saveOrUpdateVariant(MstVariant mstVariant) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.saveOrUpdate(mstVariant);
        session.flush();
    }

    @Override
    public void saveOrUpdateItem(MstItem mstItem) {
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
    public List<MstVariant> findVariantByItem(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        Criteria c = session.createCriteria(MstVariant.class);
        c.add(Restrictions.eq("item_id",id));
        List<MstVariant> results = c.list();
        return results;
    }
    @Override
    public List<AssItemInventory> findInventByItem(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        Criteria c = session.createCriteria(AssItemInventory.class, "inventory");
        c.createAlias("inventory.variant", "variant");
        c.createAlias("variant.item", "item");
        c.add(Restrictions.eq("item.id", id));
        return c.list();
    }

    @Override
    public List<AssItemInventory> findAllInvent() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(AssItemInventory.class).list();
    }

    @Override
    public List<MstCategory> findAllCategory() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstCategory.class).list();
    }
}

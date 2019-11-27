package com.astra.pos.dao;

import com.astra.pos.model.MstDistrict;
import com.astra.pos.model.MstProvince;
import com.astra.pos.model.MstRegion;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LocationDaoImpl implements LocationDao{

    @Autowired
    EntityManager entityManager;


    @Override
    public MstProvince findProvince(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstProvince.class, id);
    }

    @Override
    public List<MstProvince> findAllProvince() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstProvince.class).list();
    }

    @Override
    public MstRegion findRegion(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstRegion.class, id);
    }

    @Override
    public List<MstRegion> findAllRegion() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstRegion.class).list();
    }

    @Override
    public MstDistrict findDistrict(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstDistrict.class, id);
    }

    @Override
    public List<MstDistrict> findAllDistrict() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstDistrict.class).list();
    }
}

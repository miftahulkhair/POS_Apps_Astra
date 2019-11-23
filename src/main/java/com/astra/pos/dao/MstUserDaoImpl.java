package com.astra.pos.dao;

import com.astra.pos.model.MstEmployee;
import com.astra.pos.model.MstUser;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MstUserDaoImpl implements MstUserDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public void save(MstUser mstUser) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.save(mstUser);
        session.flush();
    }

    @Override
    public void delete(MstUser mstUser) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.delete(mstUser);
        session.flush();
    }

    @Override
    public void update(MstUser mstUser) {
        Session session = entityManager.unwrap(Session.class).getSession();
        session.update(mstUser);
        session.flush();
    }

    @Override
    public MstUser findOne(Long id) {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.get(MstUser.class, id);
    }

    @Override
    public List<MstUser> findAll() {
        Session session = entityManager.unwrap(Session.class).getSession();
        return session.createCriteria(MstUser.class).list();


//        Session session = entityManager.unwrap(Session.class).getSession();
//
//        //Get Criteria Builder
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//
//        //Create Criteria
//        CriteriaQuery<MstEmployee> criteria = builder.createQuery(MstEmployee.class);
//        Root<MstEmployee> contactRoot = criteria.from(MstEmployee.class);
//        criteria.select(contactRoot);
//
//        //Use criteria to query with session to fetch all contacts
//        List<MstEmployee> employees = session.createQuery(criteria).getResultList();
//
////        //Close session
////        session.close();
//
//        return employees;
    }
}

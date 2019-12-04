package com.astra.pos.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LoginDaoImpl implements LoginDao{
    @Autowired
    EntityManager entityManager;

    @Override
    public boolean checkLogin(String username, String password) {
        Session session = entityManager.unwrap(Session.class).getSession();
        String sql = "select * from pos_mst_user where username=? and password=?";
        SQLQuery query = session.createSQLQuery(sql);
        query.setParameter(1,username);
        query.setParameter(2,password);
        List list = query.list();
        if((list != null) && (list.size() > 0)){
            System.out.println(list);
            return true;
        }else {
            System.out.println("Username or password can't be found");
            return false;
        }
    }
}

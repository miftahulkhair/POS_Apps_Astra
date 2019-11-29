package com.astra.pos.service;

import com.astra.pos.dao.MstOutletDao;
import com.astra.pos.model.MstOutlet;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstOutletService {

    @Autowired
    MstOutletDao mstOutletDao;

    public void save(MstOutlet mstOutlet){
        mstOutletDao.save(mstOutlet);
    }

    public void delete(MstOutlet mstOutlet){
        mstOutletDao.delete(mstOutlet);
    }

    public void update(MstOutlet mstOutlet){
        mstOutletDao.update(mstOutlet);
    }

    public void saveOrUpdate(MstOutlet mstOutlet){
        mstOutletDao.saveOrUpdate(mstOutlet);
    }

    public MstOutlet findOne(Long id) {
        return mstOutletDao.findOne(id);
    }

    public List<MstOutlet> findAll() {
        return mstOutletDao.findAll();
    }
}

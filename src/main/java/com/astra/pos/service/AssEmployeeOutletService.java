package com.astra.pos.service;

import com.astra.pos.dao.AssEmployeeOutletDao;
import com.astra.pos.model.AssEmployeeOutlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssEmployeeOutletService {

    @Autowired
    AssEmployeeOutletDao assEmployeeOutletDao;

    public void save(AssEmployeeOutlet assEmployeeOutlet){
        assEmployeeOutletDao.save(assEmployeeOutlet);
    }

    public void delete(AssEmployeeOutlet assEmployeeOutlet){
        assEmployeeOutletDao.delete(assEmployeeOutlet);
    }

    public void update(AssEmployeeOutlet assEmployeeOutlet){
        assEmployeeOutletDao.update(assEmployeeOutlet);
    }

    public AssEmployeeOutlet findOne(Long id) {
        return assEmployeeOutletDao.findOne(id);
    }

    public List<AssEmployeeOutlet> findAll() {
        return assEmployeeOutletDao.findAll();
    }
}

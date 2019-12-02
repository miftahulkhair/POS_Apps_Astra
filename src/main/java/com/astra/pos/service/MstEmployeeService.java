package com.astra.pos.service;

import com.astra.pos.dao.MstEmployeeDao;
import com.astra.pos.model.MstEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MstEmployeeService {

    @Autowired
    MstEmployeeDao mstEmployeeDao;

    public void save(MstEmployee mstEmployee){
        mstEmployeeDao.save(mstEmployee);
    }

    public void delete(MstEmployee mstEmployee){
        mstEmployeeDao.delete(mstEmployee);
    }

    public void update(MstEmployee mstEmployee){
        mstEmployeeDao.update(mstEmployee);
    }

    public MstEmployee findOne(Long id) {
        return mstEmployeeDao.findOne(id);
    }

    public List<MstEmployee> findAll() {
        return mstEmployeeDao.findAll();
    }
}

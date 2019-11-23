package com.astra.pos.service;


import com.astra.pos.dao.MstUserDao;
import com.astra.pos.model.MstUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MstUserService
{

    @Autowired
    MstUserDao mstUserDao;

    public void save(MstUser mstUser){
        mstUserDao.save(mstUser);
    }

    public void delete(MstUser mstUser){
        mstUserDao.delete(mstUser);
    }

    public void update(MstUser mstUser){
        mstUserDao.update(mstUser);
    }

    public MstUser findOne(Long id) {
        return mstUserDao.findOne(id);
    }

    public List<MstUser> findAll() {
        return mstUserDao.findAll();
    }

}

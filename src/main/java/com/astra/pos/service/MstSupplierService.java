package com.astra.pos.service;

import com.astra.pos.dao.MstSupplierDao;
import com.astra.pos.model.MstSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstSupplierService {
    @Autowired
    MstSupplierDao mstSupplierDao;

    public void saveSupplier(MstSupplier mstSupplier) {
        this.mstSupplierDao.save(mstSupplier);
    }

    public void update(MstSupplier mstSupplier){
        mstSupplierDao.update(mstSupplier);
    }

    public MstSupplier getSupplier(long id) {
        return mstSupplierDao.findOne(id);
    }

    public List<MstSupplier> getAllSupplier() {
        return mstSupplierDao.findAll();
    }

    public List<MstSupplier> getSearch(String searchField) {
        return mstSupplierDao.search(searchField);
    }
}

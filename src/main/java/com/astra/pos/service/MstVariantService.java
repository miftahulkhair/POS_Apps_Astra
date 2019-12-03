package com.astra.pos.service;

import com.astra.pos.dao.MstVariantDao;
import com.astra.pos.model.MstVariant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstVariantService {

    @Autowired
    MstVariantDao mstVariantDao;

    public void saveVariant(MstVariant mstVariant) {
        this.mstVariantDao.save(mstVariant);
    }

    public MstVariant getVariant(long id) {
        return mstVariantDao.findOne(id);
    }

    public List<MstVariant> getAllVariant() {
        return mstVariantDao.findAll();
    }

}

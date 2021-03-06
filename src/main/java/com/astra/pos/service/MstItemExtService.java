package com.astra.pos.service;

import com.astra.pos.dao.MstItemExtDao;
import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstItemExtService {
    @Autowired
    MstItemExtDao mstItemExtDao;

    public void saveOrUpdateVariant(MstVariant mstVariant){
        mstItemExtDao.saveOrUpdateVariant(mstVariant);
    }
    public void saveOrUpdateItem(MstItem mstItem){
        mstItemExtDao.saveOrUpdateItem(mstItem);
    }
    public void saveOrUpdateInvent(AssItemInventory assItemInventory){
        mstItemExtDao.saveOrUpdateInvent(assItemInventory);
    }
    public MstItem findOneItem(Long id){
        return mstItemExtDao.findOneItem(id);
    }
    public MstVariant findOneVariant(Long id){
        return mstItemExtDao.findOneVariant(id);
    }
    public List<MstVariant> findAllVariant(){
        return mstItemExtDao.findAllVariant();
    }

    public List<AssItemInventory> findAllInvent(){
        return mstItemExtDao.findAllInvent();
    }

    public List<MstCategory> findAllCategory(){
        return mstItemExtDao.findAllCategory();
    }

    public List<MstVariant> findVariantByItem(Long id){
        return mstItemExtDao.findVariantByItem(id);
    }

    public List<AssItemInventory> findInventByItem(Long id){
        return mstItemExtDao.findInventByItem(id);
    }
}

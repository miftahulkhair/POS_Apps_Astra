package com.astra.pos.service;

import com.astra.pos.dao.MstItemDao;
import com.astra.pos.model.MstItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MstItemService {
    @Autowired
    MstItemDao mstItemDao;

    public void saveItem(MstItem mstItem) {
        this.mstItemDao.save(mstItem);
    }

    public void update(MstItem mstSupplier){
        mstItemDao.update(mstSupplier);
    }

    public MstItem getItem(long id) {
        return mstItemDao.findOne(id);
    }

    public List<MstItem> getAllItem() {
        return mstItemDao.findAll();
    }
}

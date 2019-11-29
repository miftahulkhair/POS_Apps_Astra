package com.astra.pos.service;

import com.astra.pos.dao.MstItemInventoryDao;
import com.astra.pos.model.AssItemInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssInventoryService {

    @Autowired
    MstItemInventoryDao mstItemInventoryDao;

    public AssItemInventory getInventory(long id) {
        return mstItemInventoryDao.findOne(id);
    }

    public List<AssItemInventory> getAllInventory() {
        return mstItemInventoryDao.findAll();
    }
}

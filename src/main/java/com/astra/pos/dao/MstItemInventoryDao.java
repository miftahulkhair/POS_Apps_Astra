package com.astra.pos.dao;

import com.astra.pos.model.AssItemInventory;

import java.util.List;

public interface MstItemInventoryDao {
    void saveUpdate(AssItemInventory assItemInventory);
    AssItemInventory findOne(Long id);
    List<AssItemInventory> findAll();

}

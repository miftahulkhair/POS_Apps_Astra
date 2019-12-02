package com.astra.pos.dao;

import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;

import java.util.List;

public interface MstItemExtDao {
    void saveOrUpdateItem(MstVariant mstVariant);
    void saveOrUpdateVariant(MstItem mstItem);
    void saveOrUpdateInvent(AssItemInventory assItemInventory);
    MstItem findOneItem(Long id);
    MstVariant findOneVariant(Long id);
    List<MstVariant> findAllVariant();
    List<AssItemInventory> findAllInvent();
}

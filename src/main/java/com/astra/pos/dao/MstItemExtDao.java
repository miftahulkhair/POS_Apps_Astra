package com.astra.pos.dao;

import com.astra.pos.model.AssItemInventory;
import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstItem;
import com.astra.pos.model.MstVariant;

import java.util.List;

public interface MstItemExtDao {
    void saveOrUpdateVariant(MstVariant mstVariant);
    void saveOrUpdateItem(MstItem mstItem);
    void saveOrUpdateInvent(AssItemInventory assItemInventory);
    MstItem findOneItem(Long id);
    MstVariant findOneVariant(Long id);
    List<MstVariant> findAllVariant();
    List<MstVariant> findVariantByItem(Long id);
    List<AssItemInventory> findInventByItem(Long id);
    List<AssItemInventory> findAllInvent();
    List<MstCategory> findAllCategory();
}

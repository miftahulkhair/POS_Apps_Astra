package com.astra.pos.dao;

import com.astra.pos.model.MstCategory;
import com.astra.pos.model.MstSupplier;

import java.util.List;

public interface MstCategoryDao {
    void saveUpdate(MstCategory mstCategory);
    MstCategory findOne(Long id);
    List<MstCategory> findAll();
}

package com.astra.pos.dao;

import com.astra.pos.model.MstItem;

import java.util.List;

public interface MstItemDao {
    void save(MstItem mstItem);
    void update(MstItem mstItem);
    MstItem findOne(Long id);
    List<MstItem> findAll();
}

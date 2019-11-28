package com.astra.pos.dao;

import com.astra.pos.model.MstVariant;

import java.util.List;

public interface MstVariantDao {

    void save(MstVariant mstVariant);
    void update(MstVariant mstVariant);
    MstVariant findOne(Long id);
    List<MstVariant> findAll();
}

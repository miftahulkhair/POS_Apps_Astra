package com.astra.pos.dao;

import com.astra.pos.model.MstOutlet;

import java.util.List;

public interface MstOutletDao {
    void save(MstOutlet mstOutlet);
    void delete(MstOutlet mstOutlet);
    void update(MstOutlet mstOutlet);
    MstOutlet findOne(Long id);
    List<MstOutlet> findAll();
}

package com.astra.pos.dao;

import com.astra.pos.model.TPr;

import java.util.List;

public interface PurchaseRequestDao {
    void save(TPr tPr);
    void update(TPr tPr);
    void saveUpdate(TPr tPr);
    TPr findOne(Long id);
    List<TPr> findAll();
}

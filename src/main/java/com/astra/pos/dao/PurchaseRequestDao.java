package com.astra.pos.dao;

import com.astra.pos.model.TPrcsRequest;

import java.util.List;

public interface PurchaseRequestDao {
    void save(TPrcsRequest tPrcsRequest);
    void update(TPrcsRequest tPrcsRequest);
    void saveUpdate(TPrcsRequest tPrcsRequest);
    TPrcsRequest findOne(Long id);
    List<TPrcsRequest> findAll();
}

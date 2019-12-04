package com.astra.pos.dao;

import com.astra.pos.model.MstSupplier;
import com.astra.pos.model.TPrcsOrder;

import java.util.List;

public interface PurchaseOrderDao {
    void update(TPrcsOrder tPrcsOrder);
    TPrcsOrder findOne(Long id);
    List<TPrcsOrder> findAll();
}

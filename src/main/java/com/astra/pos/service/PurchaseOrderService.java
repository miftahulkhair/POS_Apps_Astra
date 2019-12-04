package com.astra.pos.service;

import com.astra.pos.dao.MstOutletDao;
import com.astra.pos.dao.PurchaseOrderDao;
import com.astra.pos.model.MstSupplier;
import com.astra.pos.model.TPrcsOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseOrderService {
    @Autowired
    PurchaseOrderDao purchaseOrderDao;

    public void update(TPrcsOrder tPrcsOrder) {
        this.purchaseOrderDao.update(tPrcsOrder);
    }

    public TPrcsOrder getPO(long id) {
        return purchaseOrderDao.findOne(id);
    }

    public List<TPrcsOrder> getAllPO() {
        return purchaseOrderDao.findAll();
    }
}

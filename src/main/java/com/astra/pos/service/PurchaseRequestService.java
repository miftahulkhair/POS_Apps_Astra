package com.astra.pos.service;

import com.astra.pos.dao.PurchaseRequestDao;
import com.astra.pos.model.TPrcsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseRequestService {
    @Autowired
    PurchaseRequestDao purchaseRequestDao;

    public void saveUpdate(TPrcsRequest tPrcsRequest) {
        this.purchaseRequestDao.saveUpdate(tPrcsRequest);
    }

    public void save(TPrcsRequest tPrcsRequest) {
        this.purchaseRequestDao.save(tPrcsRequest);
    }

    public void update(TPrcsRequest tPrcsRequest) {
        this.purchaseRequestDao.update(tPrcsRequest);
    }

    public TPrcsRequest getPurchaseRequest(long id) {
        return purchaseRequestDao.findOne(id);
    }

    public List<TPrcsRequest> getAllPurchaseRequest() {
        return purchaseRequestDao.findAll();
    }
}

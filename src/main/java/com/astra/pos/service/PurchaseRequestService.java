package com.astra.pos.service;

import com.astra.pos.dao.PurchaseRequestDao;
import com.astra.pos.model.MstSupplier;
import com.astra.pos.model.TPr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PurchaseRequestService {
    @Autowired
    PurchaseRequestDao purchaseRequestDao;

    public void saveUpdate(TPr mstSupplier) {
        this.purchaseRequestDao.saveUpdate(mstSupplier);
    }

    public void save(TPr mstSupplier) {
        this.purchaseRequestDao.save(mstSupplier);
    }

    public void update(TPr mstSupplier) {
        this.purchaseRequestDao.update(mstSupplier);
    }

    public TPr getPurchaseRequest(long id) {
        return purchaseRequestDao.findOne(id);
    }

    public List<TPr> getAllPurchaseRequest() {
        return purchaseRequestDao.findAll();
    }
}

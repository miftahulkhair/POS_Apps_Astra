package com.astra.pos.dao;

import com.astra.pos.model.AssEmployeeOutlet;

import java.util.List;

public interface AssEmployeeOutletDao {
    void save(AssEmployeeOutlet assEmployeeOutlet);
    void delete(AssEmployeeOutlet assEmployeeOutlet);
    void update(AssEmployeeOutlet assEmployeeOutlet);
    AssEmployeeOutlet findOne(Long id);
    List<AssEmployeeOutlet> findAll();
}

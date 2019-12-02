package com.astra.pos.dao;

import com.astra.pos.model.MstEmployee;

import java.util.List;

public interface MstEmployeeDao {
    void save(MstEmployee mstEmployee);
    void delete(MstEmployee mstEmployee);
    void update(MstEmployee mstEmployee);
    MstEmployee findOne(Long id);
    List<MstEmployee> findAll();
}

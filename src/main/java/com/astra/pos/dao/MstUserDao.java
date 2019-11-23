package com.astra.pos.dao;

import com.astra.pos.model.MstUser;

import java.util.List;

public interface MstUserDao {
    void save(MstUser mstUser);
    void delete(MstUser mstUser);
    void update(MstUser mstUser);
    MstUser findOne(Long id);
    List<MstUser> findAll();
}

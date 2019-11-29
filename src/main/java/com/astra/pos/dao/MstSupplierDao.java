package com.astra.pos.dao;

import com.astra.pos.model.MstSupplier;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MstSupplierDao {
    void save(MstSupplier mstSupplier);
    void update(MstSupplier mstSupplier);
    void saveUpdate(MstSupplier mstSupplier);
    MstSupplier findOne(Long id);
    List<MstSupplier> findAll();
    List<MstSupplier> search(String searchField);
    List<MstSupplier> findBySearchTermNative(@Param("searchTerm") String searchTerm);
}

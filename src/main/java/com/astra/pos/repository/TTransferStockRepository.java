package com.astra.pos.repository;

import com.astra.pos.model.TTransferStock;
import com.astra.pos.model.TTransferStockHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TTransferStockRepository extends JpaRepository<TTransferStock, Long> {

}

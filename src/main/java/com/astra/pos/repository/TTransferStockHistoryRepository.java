package com.astra.pos.repository;

import com.astra.pos.model.TTransferStockHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TTransferStockHistoryRepository extends JpaRepository<TTransferStockHistory, Long> {

    List<TTransferStockHistory> findTTransferStockHistoryByTransfer_id(Long id);
}

package com.astra.pos.repository;

import com.astra.pos.model.TTransferStockDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TTransferStockDetailRepository extends JpaRepository<TTransferStockDetail, Long> {

    List<TTransferStockDetail> findTTransferStockDetailByTransfer_id(Long id);

//    @Query(value = "SELECT * FROM pos_t_transfer_stock_detail WHERE transfer_id = 1", nativeQuery = true)
//    List<TTransferStockDetail> findAllCustom();
}

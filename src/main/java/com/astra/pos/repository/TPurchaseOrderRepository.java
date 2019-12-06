package com.astra.pos.repository;

import com.astra.pos.model.TPrcsOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TPurchaseOrderRepository extends JpaRepository<TPrcsOrder, Long> {

    @Query(value = "SELECT count(*) FROM pos_t_po", nativeQuery = true)
    int countPurchaseOrder();

}

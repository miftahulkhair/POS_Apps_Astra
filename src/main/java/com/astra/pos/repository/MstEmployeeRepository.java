package com.astra.pos.repository;

import com.astra.pos.model.MstEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MstEmployeeRepository extends JpaRepository<MstEmployee, Long> {

    @Query(value = "SELECT * FROM pos_mst_employee WHERE active = true", nativeQuery = true)
    List<MstEmployee> findAllActiveEmployee();
}
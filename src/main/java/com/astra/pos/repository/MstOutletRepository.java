package com.astra.pos.repository;

import com.astra.pos.model.MstOutlet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MstOutletRepository extends JpaRepository<MstOutlet, Long> {
}

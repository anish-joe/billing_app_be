package com.billing.app.repositories;

import com.billing.app.models.BillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BillRepository extends JpaRepository<BillModel, Integer> {

    @Query("select max(customerId) from BillModel")
    public Integer findMaxCustomerId();
}

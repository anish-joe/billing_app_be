package com.billing.app.repositories;

import com.billing.app.models.CashierModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<CashierModel, Integer> {

    public List<CashierModel> findByCashierEmail(String cashierEmail);

    public List<CashierModel> findByCashierEmailAndCashierPassword(String cashierEmail, String cashierPassword);
}

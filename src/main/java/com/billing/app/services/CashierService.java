package com.billing.app.services;

import com.billing.app.models.BillDTO;
import com.billing.app.models.BillModel;
import com.billing.app.models.CashierModel;

import java.util.List;

public interface CashierService {

    public CashierModel addCashier(CashierModel model);

    public CashierModel updateCashier(CashierModel model);

    public CashierModel deleteCashier(Integer id);

    public CashierModel viewCashier(Integer id);

    public List<CashierModel> viewCashiers();

    public CashierModel loginCashier(String cashierEmail, String cashierPassword);

    public String generateBill(String name, List<BillDTO> dto);

    public List<BillModel> viewAllBills();
}

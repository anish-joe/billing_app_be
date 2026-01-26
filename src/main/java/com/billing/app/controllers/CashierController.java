package com.billing.app.controllers;

import com.billing.app.models.BillDTO;
import com.billing.app.models.BillModel;
import com.billing.app.models.CashierModel;
import com.billing.app.services.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cashier")
// baseURL = http://localhost:8080/cashier
@CrossOrigin(origins = "http://localhost:3000/")
public class CashierController {

    @Autowired
    private CashierService cashierService;

    @PostMapping("")
    public ResponseEntity<CashierModel> addNewCashier(@RequestBody CashierModel model) {
        return new ResponseEntity<CashierModel>(cashierService.addCashier(model), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<CashierModel>> viewAllCashier() {
        return new ResponseEntity<List<CashierModel>>(cashierService.viewCashiers(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CashierModel> viewOneCashier(@PathVariable Integer id) {
        return new ResponseEntity<CashierModel>(cashierService.viewCashier(id), HttpStatus.FOUND);
    }

    @PutMapping("")
    public ResponseEntity<CashierModel> updateCashier(@RequestBody CashierModel model) {
        return new ResponseEntity<CashierModel>(cashierService.updateCashier(model), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CashierModel> deleteCashier(@PathVariable Integer id) {
        return new ResponseEntity<CashierModel>(cashierService.deleteCashier(id), HttpStatus.OK);
    }

    @GetMapping("l")
    public ResponseEntity<CashierModel> loginCashier(@RequestParam String cashierEmail,
                                                     @RequestParam String cashierPassword) {
        return new ResponseEntity<CashierModel>(cashierService.loginCashier(cashierEmail, cashierPassword),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("b")
    public ResponseEntity<String> generateBill(@RequestParam String name, @RequestBody List<BillDTO> dto) {
        return new ResponseEntity<String>(cashierService.generateBill(name, dto), HttpStatus.OK);
    }

    @GetMapping("/vb")
    public ResponseEntity<List<BillModel>> viewBills() {
        return new ResponseEntity<List<BillModel>>(cashierService.viewAllBills(), HttpStatus.OK);
    }

}

package com.billing.app.controllers;

import com.billing.app.models.ProductModel;
import com.billing.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
// baseURL = http://localhost:8080/cashier
@CrossOrigin(origins = "http://localhost:3000/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("")
    public ResponseEntity<ProductModel> addNewProduct(@RequestBody ProductModel model) {
        return new ResponseEntity<ProductModel>(productService.addProduct(model), HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<ProductModel>> viewProducts() {
        return new ResponseEntity<List<ProductModel>>(productService.viewProducts(), HttpStatus.CREATED);
    }

    @PutMapping("inc/{id}")
    public ResponseEntity<ProductModel> increaseQuantity(@PathVariable Integer id) {
        return new ResponseEntity<>(productService.increaseProductQty(id), HttpStatus.ACCEPTED);
    }

    @PutMapping("dec/{id}")
    public ResponseEntity<ProductModel> decreaseQuantity(@PathVariable Integer id) {
        return new ResponseEntity<>(productService.decreaseProductQty(id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ProductModel> deleteProduct(@PathVariable Integer id) {
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<ProductModel> updateProduct(@RequestBody ProductModel model) {
        return new ResponseEntity<>(productService.updateProduct(model), HttpStatus.ACCEPTED);
    }

}

package com.billing.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bill_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Integer billId;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "bill_time")
    private String billTime;
    @Column(name = "bill_date")
    private String billDate;
    @Column(name = "cashier_name")
    private String cashierName;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "product_price")
    private Double productPrice;
    @Column(name = "product_manufacturer")
    private String productManufacturer;
    @Column(name = "product_purchase_quantity")
    private Integer productPurchaseQuantity;
}

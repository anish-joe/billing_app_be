package com.billing.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_details")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "product_man_date")
    private String productManDate;
    @Column(name = "product_manufacturer")
    private String productManufacturer;
    @Column(name = "product_exp_date")
    private String productExpDate;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "product_price")
    private Double productPrice;
    @Column(name = "product_quantity")
    private Integer productQuantity;
}

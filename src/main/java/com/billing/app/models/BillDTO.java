package com.billing.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillDTO {
    private Integer productId;
    private String productName;
    private String productImage;
    private String productManDate;
    private String productManufacturer;
    private String productExpDate;
    private String productCategory;
    private Double productPrice;
    private Integer productQuantity;
    private Integer productPurchaseQty;

}

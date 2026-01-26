package com.billing.app.services;

import com.billing.app.models.ProductModel;

import java.util.List;

public interface ProductService {
    public ProductModel addProduct(ProductModel model);

    public ProductModel updateProduct(ProductModel model);

    public ProductModel increaseProductQty(Integer id);

    public ProductModel decreaseProductQty(Integer id);

    public ProductModel deleteProduct(Integer id);

    public ProductModel viewProduct(Integer id);

    public List<ProductModel> viewProducts();

    public ProductModel decreaseProductQty(Integer productId, Integer productPurchaseQuantity);
}

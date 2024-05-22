package com.enigmacamp.tokonyadia.service;

import com.enigmacamp.tokonyadia.entity.Product;

import java.util.List;

public interface ProductInterface {
    Product saveProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    Product updateProduct(Product product);
    void deleteProduct(String id);
}

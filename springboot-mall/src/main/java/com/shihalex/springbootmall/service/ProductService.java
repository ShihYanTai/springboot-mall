package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.dto.ProductRequest;
import com.shihalex.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

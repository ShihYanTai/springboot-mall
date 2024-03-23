package com.shihalex.springbootmall.dao;

import com.shihalex.springbootmall.dto.ProductRequest;
import com.shihalex.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}

package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
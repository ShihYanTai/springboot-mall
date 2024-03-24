package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.constant.ProductCategory;
import com.shihalex.springbootmall.dto.ProductRequest;
import com.shihalex.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

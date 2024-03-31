package com.shihalex.springbootmall.dao;
import com.shihalex.springbootmall.dto.ProductQueryParams;
import com.shihalex.springbootmall.dto.ProductRequest;
import com.shihalex.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer ProductId);
    void updateStock(Integer productId, Integer stock);
}

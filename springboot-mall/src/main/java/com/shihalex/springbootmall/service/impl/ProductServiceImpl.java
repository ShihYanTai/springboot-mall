package com.shihalex.springbootmall.service.impl;

import com.shihalex.springbootmall.dao.ProductDao;
import com.shihalex.springbootmall.dto.ProductRequest;
import com.shihalex.springbootmall.model.Product;
import com.shihalex.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}

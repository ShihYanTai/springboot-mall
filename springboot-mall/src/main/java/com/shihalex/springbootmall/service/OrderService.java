package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}

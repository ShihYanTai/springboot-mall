package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.dto.CreateOrderRequest;
import com.shihalex.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

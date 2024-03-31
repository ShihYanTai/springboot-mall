package com.shihalex.springbootmall.service;

import com.shihalex.springbootmall.dto.CreateOrderRequest;
import com.shihalex.springbootmall.dto.OrderQueryParams;
import com.shihalex.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
    Integer countOrder(OrderQueryParams orderQueryParams);
}

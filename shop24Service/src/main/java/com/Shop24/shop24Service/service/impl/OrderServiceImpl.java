package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Order;
import com.Shop24.shop24Service.repository.OrderRepository;
import com.Shop24.shop24Service.service.OrderService;

public class OrderServiceImpl implements OrderService {

    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public String createOrderDetails(Order order) {
        orderRepository.save(order);
        return "Order created successfully.";
    }

    @Override
    public Order getTopFiveOrders() {
        return null;
    }

    @Override
    public Order getTopTenPaidOrders() {
        return null;
    }

    @Override
    public String completeAnOrder(Order order) {
        orderRepository.save(order);
        return "Order completed successfully.";
    }
}

package com.Shop24.shop24Service.service;

import com.Shop24.shop24Service.model.Order;

public interface OrderService {
    public String createOrderDetails(Order order);
    public Order getTopFiveOrders();
    public Order getTopTenPaidOrders();
    public String completeAnOrder(Order orderId);
}

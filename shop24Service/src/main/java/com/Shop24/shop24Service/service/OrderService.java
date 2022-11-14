package com.Shop24.shop24Service.service;

import com.Shop24.shop24Service.dto.CreateOrderDTO;
import com.Shop24.shop24Service.dto.OrderDTO;
import com.Shop24.shop24Service.model.Order;

import java.util.List;

public interface OrderService {
    public String createOrderDetails(CreateOrderDTO createOrderDTO);
    public List<OrderDTO> getTopFiveOrders();
    public List<OrderDTO> getTopTenPaidOrders();
    public String completeAnOrder(String orderId);
}

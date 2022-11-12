package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.model.Order;
import com.Shop24.shop24Service.service.OrderService;
import org.springframework.web.bind.annotation.*;

public class OrderController {

    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/createOrderDetails")
    public String createOrderDetails(@RequestBody Order order) {
        return orderService.createOrderDetails(order);
    }

    @GetMapping("/getTopFiveOrders")
    public Order getTopFiveOrders() {
        return orderService.getTopFiveOrders();
    }

    @GetMapping("/getTopTenPaidOrders")
    public Order getTopTenPaidOrders() {
        return orderService.getTopTenPaidOrders();
    }

    @PutMapping("/completeAnOrder")
    public String completeAnOrder(@RequestBody Order order) {
        return orderService.completeAnOrder(order);
    }
}

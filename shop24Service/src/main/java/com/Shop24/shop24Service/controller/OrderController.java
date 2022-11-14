package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.dto.CreateOrderDTO;
import com.Shop24.shop24Service.dto.OrderDTO;
import com.Shop24.shop24Service.model.Order;
import com.Shop24.shop24Service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/createOrderDetails")
    public String createOrderDetails(@RequestBody CreateOrderDTO createOrderDTO
    ) {
        return orderService.createOrderDetails(createOrderDTO);
    }

    @GetMapping("/getTopFiveOrders")
    public List<OrderDTO> getTopFiveOrders() {
        return orderService.getTopFiveOrders();
    }

    @GetMapping("/getTopTenPaidOrders")
    public List<OrderDTO> getTopTenPaidOrders() {
        return orderService.getTopTenPaidOrders();
    }

    @PutMapping("/completeAnOrder/{orderId}")
    public String completeAnOrder(@PathVariable String orderId) {
        return orderService.completeAnOrder(orderId);
    }
}

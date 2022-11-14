package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.dto.CreateOrderDTO;
import com.Shop24.shop24Service.dto.OrderDTO;
import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Client;
import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.model.Order;
import com.Shop24.shop24Service.repository.OrderRepository;
import com.Shop24.shop24Service.service.ClientService;
import com.Shop24.shop24Service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ClientService clientService;

    public OrderServiceImpl(OrderRepository orderRepository, ClientService clientService) {
        this.orderRepository = orderRepository;
        this.clientService = clientService;
    }

    @Override
    public String createOrderDetails(CreateOrderDTO createOrderDTO) {
        Client client = clientService.getClientDetails(createOrderDTO.getClient().getClientId());
        if(client == null){
            clientService.createClientDetails(createOrderDTO.getClient());
        }
        Integer orderId = orderRepository.getOrderIdRepo();
        for(Drinks drink : createOrderDTO.getDrinks()){
            Order order = new Order();
             order.setOrderId(orderId.toString());
             order.setClientId(createOrderDTO.getClient().getClientId());
             order.setDrinkId(drink.getDrinkId());
             order.setQuantity(drink.getQuantity());
             order.setCargoId(drink.getFkCargoId());
             order.setDrinkPrice(String.valueOf(Integer.valueOf(drink.getDrinkPrice()) * Integer.valueOf(drink.getQuantity())));
             order.setPaid(false);
             order.setComplete(false);
            orderRepository.save(order);

        }
        //orderRepository.save(order);
        return "Order created successfully.";
    }

    @Override
    public List<OrderDTO> getTopFiveOrders() {
        List<OrderDTO> topFiveOrders = orderRepository.getTopFiveOrders().isEmpty() ? null :
                orderRepository.getTopFiveOrders().stream().map(objects -> {
                    OrderDTO topOrders = new OrderDTO();
                    List<Order> orders = new ArrayList<>();
                    Order order = new Order();
                    Client client = new Client();
                    order.setOrderId(objects[0].toString());
                    order.setClientName(objects[1].toString());
                    order.setDrinkName(objects[2].toString());
                    order.setQuantity(objects[3].toString());
                    order.setTotalDrinksPrice(objects[4].toString());
                    order.setCargoName(objects[5].toString());
                    orders.add(order);
                    topOrders.setOrders(orders);
                    return topOrders;
                }).toList();
        return topFiveOrders;
    }

    @Override
    public List<OrderDTO> getTopTenPaidOrders() {
        List<OrderDTO> topTenPaidOrders = orderRepository.getTopTenPaidOrders().isEmpty() ? null :
                orderRepository.getTopTenPaidOrders().stream().map(objects -> {
                    OrderDTO topPaidOrders = new OrderDTO();
                    List<Order> orders = new ArrayList<>();
                    Order order = new Order();
                    Client client = new Client();
                    Cargo cargo = new Cargo();
                    order.setOrderId(objects[0].toString());
                    order.setClientName(objects[1].toString());
                    order.setDrinkName(objects[2].toString());
                    order.setQuantity(objects[3].toString());
                    order.setTotalDrinksPrice(objects[4].toString());
                    order.setCargoName(objects[5].toString());
                    orders.add(order);
                    client.setClientName(objects[1].toString());
                    client.setClientMobNo(objects[6].toString());
                    client.setClientEmail(objects[7].toString());
                    client.setClientType(objects[8].toString());
                    client.setClientLocation(objects[9].toString());
                    cargo.setCargoName(objects[5].toString());
                    cargo.setCargoLocation(objects[10].toString());
                    cargo.setActive((Boolean) objects[11]);
                    topPaidOrders.setOrders(orders);
                    topPaidOrders.setClient(client);
                    topPaidOrders.setCargo(cargo);
                    return topPaidOrders;
                }).toList();
        return topTenPaidOrders;
    }

    @Override
    public String completeAnOrder(String orderId) {
        List<Order> orders = orderRepository.findByOrderId(orderId);
        if(!orders.isEmpty()){
            for(Order x : orders){
                x.setPaid(true);
                x.setComplete(true);
                orderRepository.save(x);
            }
        }
        return orders.isEmpty() ? "OrderId not found" : "Order completed successfully.";
    }
}

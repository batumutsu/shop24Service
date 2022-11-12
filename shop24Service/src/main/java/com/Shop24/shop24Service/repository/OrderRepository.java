package com.Shop24.shop24Service.repository;

import com.Shop24.shop24Service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}

package com.Shop24.shop24Service.repository;

import com.Shop24.shop24Service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    @Procedure(value = "getOrder_id")
    public Integer getOrderIdRepo();

    @Query(value = "select cas.* from (SELECT distinct o.order_id, a.client_name, d.drink_name,\n" +
            "sum(o.quantity) as quantity, sum(o.drink_price) as price, c.cargo_name\n" +
            "FROM order_details o, drinks_details d,\n" +
            "cargo_details c, client_details a\n" +
            "where o.client_id = a.client_id and \n" +
            "o.cargo_id = c.cargo_id\n" +
            "and o.drink_id = d.drink_id\n" +
            "group by o.order_id\n" +
            "order by price desc limit 5) cas group by cas.client_name", nativeQuery = true)
    List<Object[]> getTopFiveOrders();

    @Query(value = "SELECT distinct o.order_id, a.client_name, d.drink_name,\n" +
            "            sum(o.quantity) as quantity, sum(o.drink_price) as price, c.cargo_name,\n" +
            "            a.client_mob_no, a.client_email, t.client_type_desc, \n" +
            "            (select location_name from location_mas where location_id = a.client_location) client_location,\n" +
            "            (select location_name from location_mas where location_id = c.cargo_location) cargo_location,\n" +
            "            c.is_active\n" +
            "            FROM order_details o, drinks_details d,\n" +
            "            cargo_details c, client_details a, client_type_mas t\n" +
            "            where o.client_id = a.client_id and o.cargo_id = c.cargo_id\n" +
            "            and o.drink_id = d.drink_id\n" +
            "            and o.is_paid = 1\n" +
            "            and a.client_type = t.client_type\n" +
            "            group by o.order_id\n" +
            "            order by price desc limit 10", nativeQuery = true)
    List<Object[]> getTopTenPaidOrders();

    List<Order> findByOrderId(String orderId);
}

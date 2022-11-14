package com.Shop24.shop24Service.repository;

import com.Shop24.shop24Service.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo, String> {

    @Query(value = "SELECT o.order_id, d.drink_name, o.quantity, o.drink_price, c.cargo_name, o.completed_date\n" +
            "            FROM order_details o, cargo_details c, drinks_details d\n" +
            "            where d.drink_id = o.drink_id\n" +
            "            and c.cargo_id = o.cargo_id\n" +
            "            and o.cargo_id = ?1 \n" +
            "            and o.completed_date BETWEEN ?2 AND ?3 \n" +
            "            order by o.completed_date desc", nativeQuery = true)
    List<Object[]> getCargoVolumeByDates(String cargoId, Date startDate, Date endDate);
}

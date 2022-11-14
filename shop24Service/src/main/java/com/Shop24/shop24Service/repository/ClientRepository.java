package com.Shop24.shop24Service.repository;

import com.Shop24.shop24Service.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, String> {

    @Query(value = "SELECT c.cargo_name, l.location_name, c.is_active\n" +
            "            FROM cargo_details c, client_details a, location_mas l\n" +
            "            where c.cargo_location = a.client_location\n" +
            "            and l.location_id = c.cargo_location\n" +
            "            and a.client_id = ?1\n" +
            "            order by cargo_name limit 3", nativeQuery = true)
    List<Object[]> getClientClosestCargo(String clientId);
}

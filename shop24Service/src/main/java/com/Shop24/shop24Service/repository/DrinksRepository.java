package com.Shop24.shop24Service.repository;

import com.Shop24.shop24Service.model.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface DrinksRepository extends JpaRepository<Drinks, String> {

    //String drinkId, String drinkName, String drinkPrice, Boolean isInStock, String quantity
    @Query(value = "SELECT d.drinkName as drinkName, sum(u.quantity) as quantity\n" +
            "FROM Order u, Drinks d \n" +
            "where d.drinkId = u.drinkId\n" +
            "group by u.drinkId order by quantity desc")
    List<Object[]> getMostConsumedDrinksRepo();

    @Query(value = "SELECT distinct d.drinkName, c.cargoName\n" +
            "FROM Drinks d,Cargo c, Client a\n" +
            "where d.isInStock = 1 and \n" +
            "d.fkCargoId = c.cargoId\n" +
            "and c.cargoLocation = a.clientLocation\n" +
            "and a.clientId = ?1")
    List<Object[]> getAvailableDrinksAndCargo(String clientId);
}

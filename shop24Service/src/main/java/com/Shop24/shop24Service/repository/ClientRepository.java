package com.Shop24.shop24Service.repository;

import com.Shop24.shop24Service.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}

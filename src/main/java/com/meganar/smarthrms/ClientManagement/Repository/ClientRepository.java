package com.example.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hr.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
}

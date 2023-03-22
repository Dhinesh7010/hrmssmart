package com.meganar.smarthrms.ClientManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meganar.smarthrms.ClientManagement.Model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
}

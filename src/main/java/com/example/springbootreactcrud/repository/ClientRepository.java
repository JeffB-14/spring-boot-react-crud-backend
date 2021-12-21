package com.example.springbootreactcrud.repository;

import com.example.springbootreactcrud.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
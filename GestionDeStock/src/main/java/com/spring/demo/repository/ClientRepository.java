package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}

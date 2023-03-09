package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Ventes;

public interface VentesRepository extends JpaRepository<Ventes, Integer> {

}

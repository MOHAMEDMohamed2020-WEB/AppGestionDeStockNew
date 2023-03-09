package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Utilisiateur;

public interface UtilisiateurRepository extends JpaRepository<Utilisiateur, Integer>{

}

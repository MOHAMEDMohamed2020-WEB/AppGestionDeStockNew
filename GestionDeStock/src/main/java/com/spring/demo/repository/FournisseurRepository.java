package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer>{

}

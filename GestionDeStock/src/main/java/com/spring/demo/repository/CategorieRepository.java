package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

}

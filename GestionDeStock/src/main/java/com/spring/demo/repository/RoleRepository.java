package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}

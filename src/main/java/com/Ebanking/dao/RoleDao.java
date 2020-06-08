package com.Ebanking.dao;

import org.springframework.data.repository.CrudRepository;

import com.Ebanking.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    
    Role findByName(String name);
}

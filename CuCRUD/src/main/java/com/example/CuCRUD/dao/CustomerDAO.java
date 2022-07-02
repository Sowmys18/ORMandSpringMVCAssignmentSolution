package com.example.CuCRUD.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.CuCRUD.model.CustomerD;

public interface CustomerDAO extends CrudRepository<CustomerD, Integer> {

}

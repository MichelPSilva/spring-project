package com.springproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.springproject.beans.Products;

public interface ProductsDAO extends CrudRepository<Products, Integer> {

}

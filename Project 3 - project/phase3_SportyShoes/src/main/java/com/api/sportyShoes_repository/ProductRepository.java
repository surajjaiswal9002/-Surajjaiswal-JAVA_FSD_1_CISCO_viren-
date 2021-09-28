package com.api.sportyShoes_repository;

import org.springframework.data.repository.CrudRepository;

import com.api.sportyShoes_model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

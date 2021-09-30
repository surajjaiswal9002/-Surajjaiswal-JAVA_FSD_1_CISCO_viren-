package com.api.sportyShoes_p3.repository;



import java.sql.Date;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.api.sportyShoes_p3.model.Product;

@Transactional
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	public List<Product> findByBrand(String brand);
	public List<Product> findBySeason(String season);
	public List<Product> findByCategory(String category);
	public List<Product> findByPrice(int price);
	public List<Product> findByDate(Date date);
	public List<Product> findByColor(String color);
	



}

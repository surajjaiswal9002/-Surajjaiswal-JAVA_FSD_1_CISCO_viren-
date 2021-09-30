package com.api.sportyShoes_p3.repository;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.api.sportyShoes_p3.model.Purchase;
@Transactional
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {

	List<Purchase> findByUsername(String username);

	
	
	



}

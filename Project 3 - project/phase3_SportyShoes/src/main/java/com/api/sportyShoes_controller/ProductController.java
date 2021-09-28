package com.api.sportyShoes_controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sportyShoes_model.Product;
import com.api.sportyShoes_repository.ProductRepository;




@RestController
@RequestMapping("products")
public class ProductController 
{
	@Autowired
	ProductRepository productrepository;
	
		// insert new product into database
		@PostMapping("add")
		public Product addProduct(@RequestBody Product product)
		{
			return productrepository.save(product);
		}
		
		
		// retrieve all product from database
		@GetMapping("all")
		public List<Product> getAllProduct()
		{
			List<Product> product=(List<Product>) productrepository.findAll(); 
			return product;
		}
		
		
		// get particular product by their ID
		@GetMapping("product/{id}")
		public Optional<Product>  getProductId(@PathVariable int id)
		{
			return productrepository.findById(id);
		}
		

		// update existing product 
		@PutMapping("update/{id}")
		public Product updatProduct(@RequestBody Product product)
		{
			return productrepository.save(product);
		}
		
		// delete particular product from database
		@DeleteMapping("delete/{id}")
		public void deleteProduct(@PathVariable int id)
		{
			productrepository.deleteById(id);
		}

}

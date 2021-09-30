package com.api.sportyShoes_p3.controller;


import java.sql.Date;
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


import com.api.sportyShoes_p3.model.Product;
import com.api.sportyShoes_p3.repository.ProductRepository;


@RestController
@RequestMapping("products")
public class ProductController 
{
	@Autowired
	ProductRepository productrepository;
	
		// add new product into database
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

		// update product by id  from database
				@PutMapping("update/{id}")
				public Product updatProduct(@RequestBody Product product)
				{
					return productrepository.save(product);
				}
		
		// delete the  product by id from database
				@DeleteMapping("delete/{id}")
				public void deleteProduct(@PathVariable int id)
				{
					productrepository.deleteById(id);
				}

		// get particular product by their ID
				@GetMapping("searchbyid/{id}")
				public Optional<Product> getProductId(@PathVariable int id)
				{
					return productrepository.findById(id);
				}

		// search the product by season from database
				@GetMapping("searchbyseason/{season}")
				public List<Product> searchProductbyseason(@PathVariable String season)
				{
				List<Product> searchByseason = productrepository.findBySeason(season);
				return searchByseason;
		
				}
		
		// search the product by brand from database
				@GetMapping("searchbybrand/{brand}")
				public List<Product> searchProductbybrand(@PathVariable String brand)
				{
				List<Product> searchBybrand = productrepository.findByBrand(brand);
				return searchBybrand;
		
				}

		// search the product by category from database
				@GetMapping("searchbycategory/{category}")
				public List<Product> searchProductbycategory(@PathVariable String category)
				{
				List<Product> searchBycategory = productrepository.findByCategory(category);
				return searchBycategory;
				}
		//search the product by price from database
				@GetMapping("searchbyprice/{price}")
				public List<Product> searchProductbyprice(@PathVariable int price)
				{
					List<Product> searchbyprice = productrepository.findByPrice(price);
					return searchbyprice;
				}
				
		//search the product by product name from database
				@GetMapping("searchbycolor/{color}")
				public List<Product> searchProductbycolor(@PathVariable String color)
				{
					List<Product> searchbycolor= productrepository.findByColor(color);
					return searchbycolor;
				}

		//search the product by date from database
				@GetMapping("searchbydate/{date}")
				public List<Product> searchProductbydate(@PathVariable Date date)
				{
					List<Product> searchbydate = productrepository.findByDate(date);
					return searchbydate;
				}

				

}

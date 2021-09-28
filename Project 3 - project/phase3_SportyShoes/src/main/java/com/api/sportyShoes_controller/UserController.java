package com.api.sportyShoes_controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sportyShoes_model.Product;
import com.api.sportyShoes_model.User;
import com.api.sportyShoes_repository.UserRepository;


@RestController
@RequestMapping("users")
public class UserController
{
	@Autowired
	UserRepository userrepository;

	
			// update existing product 
			@PutMapping("userupdate/{id}")
			public User updatProduct(@RequestBody User user)
			{
				return userrepository.save(user);
			}

			// delete particular product from database
			@DeleteMapping("userdelete/{id}")
			public void deleteProduct(@PathVariable int u_id)
			{
				userrepository.deleteById(u_id);
			}
			
			// retrieve all user from database
			@GetMapping("userall")
			public List<User> getAllStudent()
			{
				List<User> user=(List<User>) userrepository.findAll(); 
				return user;
			}
			
	
}

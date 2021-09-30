package com.api.sportyShoes_p3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sportyShoes_p3.model.User;
import com.api.sportyShoes_p3.repository.UserRepository;


@RestController
@RequestMapping("users")
public class UserController
{
	@Autowired
	UserRepository userrepository;

		// retrieve all user from database
				@GetMapping("userall")
				public List<User> getAllUser()
				{
					List<User> user=(List<User>) userrepository.findAll(); 
					return user;
				}

		// add data from user
				@PostMapping("useradd")
				public User addUser(@RequestBody User user)
				{
					return userrepository.save(user);
				}
	
		// update existing product 
				@PutMapping("userupdate/{id}")
				public User updatUser(@RequestBody User user)
				{
					return userrepository.save(user);
				}

		// delete particular product from database
				@DeleteMapping("userdelete/{id}")
				public void deleteUser(@PathVariable int u_id)
				{
					userrepository.deleteById(u_id);
				}

}

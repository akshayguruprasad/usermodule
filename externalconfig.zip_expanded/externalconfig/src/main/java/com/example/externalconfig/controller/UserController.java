package com.example.externalconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.externalconfig.model.UserEntity;
import com.example.externalconfig.service.UserService;

@RestController("/user")
@RestControllerAdvice
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	Environment env;

	@PostMapping("/create")
	public ResponseEntity<String> createUser(@RequestBody UserEntity entity) {
		userService.createUser(entity);
		return new ResponseEntity<>(env.getProperty("user.create.success"), HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<String> updateUser(@RequestBody UserEntity entity) {

		userService.updateUser(entity);
		return new ResponseEntity<>(env.getProperty("user.update.success"), HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
		return new ResponseEntity<>(env.getProperty("user.delete.success"), HttpStatus.OK);

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<UserEntity> getUser(@PathVariable String id) {

		return new ResponseEntity<UserEntity>(userService.getUser(id), HttpStatus.OK);

	}

}

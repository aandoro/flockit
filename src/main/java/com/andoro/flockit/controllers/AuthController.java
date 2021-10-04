package com.andoro.flockit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.andoro.flockit.entities.AuthResponse;
import com.andoro.flockit.entities.User;
import com.andoro.flockit.services.AuthService;

@RestController
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	AuthResponse login(@RequestBody User userLogin) {
		return authService.login(userLogin);
	}
}

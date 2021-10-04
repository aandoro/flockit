package com.andoro.flockit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.andoro.flockit.entities.AuthResponse;
import com.andoro.flockit.entities.User;
import com.andoro.flockit.services.AuthService;

@SpringBootTest
class FlockitApplicationTests {
	
	@Autowired
	private AuthService authService;

	@Test
	void contextLoads() {
		User user = new User("admin","admin");
		AuthResponse res = authService.login(user);
		assert(res.getToken().equals(""));
	}

}

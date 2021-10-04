package com.andoro.flockit;

import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.andoro.flockit.entities.AuthResponse;
import com.andoro.flockit.entities.User;
import com.andoro.flockit.services.AuthService;
import com.andoro.flockit.services.ProvinceService;

@SpringBootTest
class FlockitApplicationTests {

	@Autowired
	private AuthService authService;

	@Autowired
	private ProvinceService provinceService;

	@Test
	void contextLoads() {
		login();
		province();
	}

	public void login() {
		User user = new User("admin", "admin");
		AuthResponse res = authService.login(user);
		assert (!res.getToken().isEmpty());
	}

	public void province() {
		LinkedHashMap res = provinceService.getProvince("chubut");
		assert (res.get("id").equals("26"));
	}

}

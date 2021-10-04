package com.andoro.flockit.services;

import java.nio.file.Paths;
import org.apache.log4j.Logger;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.andoro.flockit.entities.AuthResponse;
import com.andoro.flockit.entities.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AuthServiceImple implements AuthService {

	static Logger log = Logger.getLogger(AuthServiceImple.class.getName());

	@Override
	public AuthResponse login(User userLogin) {
		ObjectMapper mapper = new ObjectMapper();
		AuthResponse authResponse = new AuthResponse();
		try {
			User user = mapper.readValue(Paths.get("user.json").toFile(), User.class);
			if (user.equals(userLogin)) {
				authResponse.setUser(userLogin);
				authResponse.setToken(DigestUtils.sha256Hex(userLogin.getUsername() + userLogin.getPassword()));
				return authResponse;
			}
			authResponse.setUser(userLogin);
		} catch (Exception e) {
			log.error(e.getStackTrace());
			System.out.println(e.getMessage());
		}
		return authResponse;
	}

}

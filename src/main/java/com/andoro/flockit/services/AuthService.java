package com.andoro.flockit.services;

import com.andoro.flockit.entities.AuthResponse;
import com.andoro.flockit.entities.User;

public interface AuthService {

	AuthResponse login(User userLogin);
}

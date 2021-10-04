package com.andoro.flockit.controllers;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andoro.flockit.services.ProvinceService;

@RestController
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;

	@GetMapping("/info")
	String getInfo() {
		return "info";
	}

	@GetMapping("/provinces")
	LinkedHashMap getProvince(@RequestParam("name") String name) {
		return provinceService.getProvince(name);
	}
}

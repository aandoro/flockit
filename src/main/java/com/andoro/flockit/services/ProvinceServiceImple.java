package com.andoro.flockit.services;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.andoro.flockit.utils.Constants;

@Service
public class ProvinceServiceImple implements ProvinceService {

	static Logger log = Logger.getLogger(ProvinceServiceImple.class.getName());

	@Override
	public LinkedHashMap getProvince(String name) {
		RestTemplate restTemplate = new RestTemplate();
		try {
			LinkedHashMap res = (LinkedHashMap) restTemplate.getForObject(Constants.API_PROVINCE + "?nombre=" + name,
					Object.class);
			ArrayList provinces = (ArrayList) res.get("provincias");
			LinkedHashMap province = (LinkedHashMap) provinces.get(0);
			return province;
		} catch (Exception e) {
			log.error(e.getStackTrace());
			System.out.println(e.getMessage());
		}
		return null;
	}

}

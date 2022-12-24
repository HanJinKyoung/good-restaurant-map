package com.goodrestaurant.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodrestaurant.map.dao.TestDAO;
import com.goodrestaurant.map.dto.TestDTO;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {
	
	@Autowired
	private TestDAO testDAO;
	
	@GetMapping("/hello2")
	public List<TestDTO> HelloWorld(){
		return testDAO.getTestData();
	}

}

package com.ravi.spring_boot_first.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public List<String> HelloWorldController() {
		// TODO Auto-generated constructor stub
		return  Arrays.asList("Vishwajit","Ravi","Satyajit","Swami","NImbalkar");
	}

}

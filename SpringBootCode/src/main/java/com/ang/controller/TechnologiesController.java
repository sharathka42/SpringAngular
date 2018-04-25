package com.ang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ang.model.Technology;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TechnologiesController {

	@GetMapping("/technologies")
	public List<Technology> getAllCustomers() {
		
		List<Technology> customers = new ArrayList<Technology>();
		customers.add(new Technology("1","Angular",10,true));
		customers.add(new Technology("2","React",15,true));
		customers.add(new Technology("3","ExtJS",12,false));
		customers.add(new Technology("4","CSS",20,false));
		customers.add(new Technology("5","HTML",18,true));
		customers.add(new Technology("6","Core Java",19,true));
		customers.add(new Technology("7","Spring",5,false));
		customers.add(new Technology("8","Hibernate",4,true));
		customers.add(new Technology("9","Spring boot",3,true));
		return customers;

	}
}

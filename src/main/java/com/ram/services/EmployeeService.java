package com.ram.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	private List<String> empNames;
	
	public List<String> getEmployeeNames() {
		
		return empNames;
	}
	public void addEmployeeName(String name) {
		empNames.add(name);
	}
	
	@PostConstruct
	private void init() {
		empNames = new ArrayList<>();
		empNames.add("Ram");
		empNames.add("Geetha");
	}
	
}

package com.ram.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	/**
	 * This method will return the list of emplyoess.
	 * @return
	 */
	@RequestMapping(value="/names", method=RequestMethod.GET)
	public List<String> getEmpNames() {
		
		List<String> empNames = empService.getEmployeeNames();
		
		return empNames;
		
	}
	
	@RequestMapping(value = "/names", method=RequestMethod.POST)
	public boolean addNewEmployeeName(@RequestParam(name="emp_name", required=true) String empName) {
		empService.addEmployeeName(empName);
		return true;
	}
}

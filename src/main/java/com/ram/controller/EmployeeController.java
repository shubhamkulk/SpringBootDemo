package com.ram.controller;

import java.io.File;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ram.model.Employee;
import com.ram.model.EmployeesList;

@RestController
public class EmployeeController
{
	@RequestMapping(value = "/employee/{employeeName}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable String employeeName)
	{
		try {
            ObjectMapper mapper = new ObjectMapper();
            EmployeesList employeesList = mapper.readValue(new File("data/employees.json"), EmployeesList.class);

            return employeesList.getEmployee(employeeName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
}

package com.ram.model;

import java.util.List;

public class EmployeesList {
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getEmployee(String name){
        for(Employee e : employees){
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }
}
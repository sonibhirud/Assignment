package com.app.mindBowser.Service;

import java.util.List;

import com.app.mindBowser.model.Employee;

public interface IEmployeeService {
	
	public boolean saveEmployee(Employee employee);  
    public List<Employee> getEmployees();  
    public boolean deleteEmployee(Employee employee);  
    public boolean updateEmployee(Employee employee); 

}

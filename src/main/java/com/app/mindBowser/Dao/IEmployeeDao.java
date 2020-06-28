package com.app.mindBowser.Dao;

import java.util.List;

import com.app.mindBowser.model.Employee;

public interface IEmployeeDao {
	
	public boolean saveEmployee(Employee employee);  
    public List<Employee> Employees();  
    public boolean deleteEmployee(Employee employee);   
    public boolean updateEmployee(Employee employee);

}

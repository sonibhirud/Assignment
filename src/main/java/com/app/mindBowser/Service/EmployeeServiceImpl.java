package com.app.mindBowser.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.mindBowser.Dao.IEmployeeDao;
import com.app.mindBowser.model.Employee;
@Service  
@Transactional 
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired  
    private IEmployeeDao employeeDao;

	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.Employees();
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

}

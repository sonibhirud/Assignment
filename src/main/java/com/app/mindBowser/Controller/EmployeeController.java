package com.app.mindBowser.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mindBowser.Service.IEmployeeService;
import com.app.mindBowser.model.Employee;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")
public class EmployeeController {
	
	 @Autowired  
	    public IEmployeeService empService;
	 
	  // method to save employee
	 @PostMapping("saveEmployee")  
	    public boolean saveStudent(@RequestBody Employee employee) {  
	         return empService.saveEmployee(employee);  
	          
	    }  
	 
	 // method to get employee list
	 @GetMapping("employeeList")  
	    public List<Employee> allEmployees() {  
	         return empService.getEmployees();  
	          
	    } 
	 
	// method to delete employee
	 @DeleteMapping("deleteEmployee/{empId}")  
	    public boolean deleteEmployee(@PathVariable("empId") int empId,Employee employee) {  
		 employee.setEmpId(empId);
	       return  empService.deleteEmployee(employee);
	    } 
	 
	// method to update employee
	 @PostMapping("updateEmployee/{empId}")  
	    public boolean updateEmployeet(@RequestBody Employee employee,@PathVariable("empId") int empId) {  
		 employee.setEmpId(empId);
	     return empService.updateEmployee(employee); 
	    } 

}

package com.app.mindBowser.Dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.mindBowser.model.Employee;
@Repository 
public class EmployeeDaoImpl implements IEmployeeDao {
	
	@Autowired  
    private SessionFactory sessionFactory;

	@Override
	public boolean saveEmployee(Employee employee) {
		boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().save(employee);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;
	}

	@Override
	public List<Employee> Employees() {
		Session currentSession = sessionFactory.getCurrentSession();  
        Query<Employee> query=currentSession.createQuery("from Employee", Employee.class);  
        List<Employee> list=query.getResultList();  
        return list;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().delete(employee);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().update(employee);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
	}

}

package com.app.mindBowser.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="employee")
public class Employee {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int empId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;
	private String empCity;
	private Date empBirthDate;
	private int empMobileNo;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public Date getEmpBirthDate() {
		return empBirthDate;
	}
	public void setEmpBirthDate(Date empBirthDate) {
		this.empBirthDate = empBirthDate;
	}
	public int getEmpMobileNo() {
		return empMobileNo;
	}
	public void setEmpMobileNo(int empMobileNo) {
		this.empMobileNo = empMobileNo;
	}
	public Employee() {
		super();
	}
	public Employee(int empId, String empFirstName, String empLastName, String empAddress, String empCity,
			Date empBirthDate, int empMobileNo) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empAddress = empAddress;
		this.empCity = empCity;
		this.empBirthDate = empBirthDate;
		this.empMobileNo = empMobileNo;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empAddress=" + empAddress + ", empCity=" + empCity + ", empBirthDate=" + empBirthDate
				+ ", empMobileNo=" + empMobileNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAddress == null) ? 0 : empAddress.hashCode());
		result = prime * result + ((empBirthDate == null) ? 0 : empBirthDate.hashCode());
		result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
		result = prime * result + ((empFirstName == null) ? 0 : empFirstName.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empLastName == null) ? 0 : empLastName.hashCode());
		result = prime * result + empMobileNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empAddress == null) {
			if (other.empAddress != null)
				return false;
		} else if (!empAddress.equals(other.empAddress))
			return false;
		if (empBirthDate == null) {
			if (other.empBirthDate != null)
				return false;
		} else if (!empBirthDate.equals(other.empBirthDate))
			return false;
		if (empCity == null) {
			if (other.empCity != null)
				return false;
		} else if (!empCity.equals(other.empCity))
			return false;
		if (empFirstName == null) {
			if (other.empFirstName != null)
				return false;
		} else if (!empFirstName.equals(other.empFirstName))
			return false;
		if (empId != other.empId)
			return false;
		if (empLastName == null) {
			if (other.empLastName != null)
				return false;
		} else if (!empLastName.equals(other.empLastName))
			return false;
		if (empMobileNo != other.empMobileNo)
			return false;
		return true;
	}
	
	
	
	

}



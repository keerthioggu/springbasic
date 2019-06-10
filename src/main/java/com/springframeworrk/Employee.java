package com.springframeworrk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import sun.security.util.Password;
@Component
//@Repository
//@Service
public class Employee {
	
	private Integer empId;
	private String empName;
	private String empCity;
	private String empCompany;
	
	@Autowired
	private Passport pport;
	
	public Employee() {
		System.out.println("inside no arg constructor :: Employee");
	}
	
	public Employee(Passport p) {
		System.out.println("inside passport argument constructor :: Employee");
		this.pport = p;
	}
	public Integer getEmpId() {
		return empId;
	}
	public Passport getPport() {
		return pport;
	}
	public void setPport(Passport pport) {
		this.pport = pport;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpCompany() {
		return empCompany;
	}
	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}
	
	}

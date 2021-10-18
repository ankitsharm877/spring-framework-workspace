package com.spring.framework.basics.spring.bean.autowiring;

public class Employee {
	
	String fullName;
	
	Department department;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}

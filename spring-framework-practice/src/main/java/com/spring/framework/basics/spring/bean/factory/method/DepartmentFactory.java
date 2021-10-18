package com.spring.framework.basics.spring.bean.factory.method;

public class DepartmentFactory {

	public static Department createDepartmentBean(String type) {
		if ("manager".equals(type) || "employee".equals(type)) {
			Department department = new Department();
			department.setName("Ankit");
			return department;
		} else {
			throw new IllegalArgumentException("Unknown Product");
		}
	}
}

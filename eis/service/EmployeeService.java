package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public interface EmployeeService {
	public Employee setDetails() throws EmployeeException;

	public void Insurance(int salary, String designation, Employee e);

	public void getDetails();

}

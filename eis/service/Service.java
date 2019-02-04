package com.cg.eis.service;

import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class Service implements EmployeeService {
	Employee e;

	public Employee setDetails()throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println("enter the emp id");
		int a = sc.nextInt();
		System.out.println("Enter the Salary");
		int b = sc.nextInt();
		System.out.println("Enter the Designation");
		String str1 = sc.next();
		System.out.println("Enter the insurence");
		String str2 = sc.next();
		e = new Employee(a, str, b, str1, str2);
		sc.close();
		if(b<3000)
		{
			throw new EmployeeException("salary Should Be Greater then 3000");
		}

	
		return e;
	
		}

	public void Insurance(int salary, String designation, Employee a) {
		if (designation.equals("System Associate") && (salary > 5000 && salary < 20000))
			a.setInsurance("C");
		else if (designation.equals("Programmer") && (salary >= 20000 && salary < 40000))
			a.setInsurance("B");
		else if (designation.equals("Manager") && (salary >= 40000))
			a.setInsurance("A");
		else if (designation.equals("Clerk") && (salary < 5000))
			a.setInsurance("No");

	}

	public void getDetails() {
		System.out.println("Salary is: " + e.getSalary());
		System.out.println("Employee name is: " + e.getName());
		System.out.println("Employee id is: " + e.getId());
		System.out.println("Employee designation is: " + e.getDesignation());
		System.out.println("Employee insurance scheme is: " + e.getInsurance());
	}

}

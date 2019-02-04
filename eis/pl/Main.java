package com.cg.eis.pl;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service s = new Service();
try {
	
		Employee e = s.setDetails();

		System.out.println("Salary is: " + e.getSalary());
		System.out.println("Employee name is: " + e.getName());
		System.out.println("Employee id is: " + e.getId());
		System.out.println("Employee designation is: " + e.getDesignation());
		System.out.println("Employee insurance scheme is: " + e.getInsurance());
		s.Insurance(e.getSalary(), e.getDesignation(), e);
		s.getDetails();
}
catch(Exception e){
	System.out.println(e.getMessage());
}
	}
}
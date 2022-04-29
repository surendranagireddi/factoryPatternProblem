package com.java.test;

import com.java.comp.AadharDetails;
import com.java.comp.Employee;
import com.java.comp.Person;
import com.java.comp.Student;

public class FactoryPatternProblem {
	
	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(123456l,20,90009l);
		Person emp = new Employee("rani","hyd",details,"Hcl",9899.0);
		System.out.println(emp);
		
		System.out.println("============================");
		AadharDetails details1 = new AadharDetails(13453l,21,998989l);
		Person stu = new Student ("Shyam","vizag",details1,"Java",9899);
		System.out.println(stu);
	}

}

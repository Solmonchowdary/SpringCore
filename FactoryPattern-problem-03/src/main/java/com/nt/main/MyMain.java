package com.nt.main;

import com.nt.cls.Cust;
import com.nt.cls.Employee;
import com.nt.cls.Person;
import com.nt.cls.Student;

public class MyMain {

	public static void main(String[] args) {
		Person p1=new Cust("solomon","1","12000");
		Person p2=new Student("solomon","1","12000");
		Person p3=new Employee("solomon","1","12000");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);;
		

	}

}

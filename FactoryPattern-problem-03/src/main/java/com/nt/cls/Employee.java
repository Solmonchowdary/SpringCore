package com.nt.cls;

public class Employee extends Person {
	
	private String empname;
	private String empno;
	private String empsalery;
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEmpsalery() {
		return empsalery;
	}
	public void setEmpsalery(String empsalery) {
		this.empsalery = empsalery;
	}
	
	
	public Employee(String empname, String empno, String empsalery) {
		super();
		this.empname = empname;
		this.empno = empno;
		this.empsalery = empsalery;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empno=" + empno + ", empsalery=" + empsalery + "]";
	}
	

}

package com.nt.cls;

public class Student extends Person {
	
	private String sname;
	private String sno;
	private String smarks;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSmarks() {
		return smarks;
	}
	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	public Student(String sname, String sno, String smarks) {
		super();
		this.sname = sname;
		this.sno = sno;
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + ", smarks=" + smarks + "]";
	}
	

}

package com.nt.cls;

public class Cust extends Person {
	
	private String cname;
	private String cno;
	private String cbill;
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCbill() {
		return cbill;
	}
	public void setCbill(String cbill) {
		this.cbill = cbill;
	}
	public Cust(String cname, String cno, String cbill) {
		super();
		this.cname = cname;
		this.cno = cno;
		this.cbill = cbill;
	}
	@Override
	public String toString() {
		return "Cust [cname=" + cname + ", cno=" + cno + ", cbill=" + cbill + "]";
	}
	
	

}

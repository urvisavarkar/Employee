package com.optus;

import java.util.ArrayList;
public class Employee {
	int eid;
	String ename,dept,domain,pid;
	public Employee(){}
	public Employee(int eid, String ename, String dept,String domain, String pid) {
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.domain= domain;
		this.pid = pid;
	}
	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	public String getDept() {
		return dept;
	}
	public String getDomain() {
		return domain;
	}
	public String getPid() {
		return pid;
	}
	public ArrayList<Employee> setValues(){
		ArrayList<Employee> elist=new ArrayList<Employee>();
		Employee edata=new Employee(1001,"Ani","Newscom","Communication","pid_100");
		Employee emp=new Employee(1002,"Baruni","Portal","Java","pid_2091");
		Employee emp1=new Employee(1234,"Shubhi","Support","DataAcces","pid_908");
		Employee emp2=new Employee(1111,"Allon","Support","WebServices","pid_2008");
		Employee emp3=new Employee(1003,"Aji","IT","WebServices","pid_8908");
		Employee emp4=new Employee(2222,"Sachin","IES","C#","pid_945");
		Employee emp5=new Employee(2333,"Ann","Portal","Java","pid_0123");
		elist.add(edata);
		elist.add(emp);
		elist.add(emp1);
		elist.add(emp2);
		elist.add(emp3);
		elist.add(emp4);
		elist.add(emp5);
		return elist;
	}
}

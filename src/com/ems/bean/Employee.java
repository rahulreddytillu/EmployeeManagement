package com.ems.bean;

public class Employee {
	private int eid;
	private String ename ;
	private int eage;
	private String edept;
	private double esalary;
	private int noofleaves;
	public Employee(){
		
	}
	public Employee(int eid, String ename, int eage, String edept, double esalary, int noofleaves) {
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.edept = edept;
		this.esalary = esalary;
		this.noofleaves = noofleaves;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public int getNoofleaves() {
		return noofleaves;
	}
	public void setNoofleaves(int noofleaves) {
		this.noofleaves = noofleaves;
	}
	public String toString(){
		return eid+"\t"+ename+"\t"+eage+"\t"+edept+"\t"+esalary+"\t"+noofleaves;
	}
	

}

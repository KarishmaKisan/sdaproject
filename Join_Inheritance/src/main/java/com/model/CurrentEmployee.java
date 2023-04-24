package com.model;

public class CurrentEmployee extends Employee{
	private int salary;
	private int experiance;
	
	public CurrentEmployee() {
		
	}
	public CurrentEmployee(int id, String name,int salary,int experiance) {
		super(id, name);
		this.salary=salary;
		this.experiance=experiance;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		
		return "CurrentEmployee [salary=" + salary + ", experiance=" + experiance + "]";
		
		
		}
}

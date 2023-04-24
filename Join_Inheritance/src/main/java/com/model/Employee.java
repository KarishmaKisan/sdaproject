package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="emp_details")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {
@Id	
	private int id;
	private String name;
	public Employee() {
		super();
	
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
     public void display() {
	System.out.println(id+" "+name);
}
}

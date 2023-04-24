package com.model;

public class RetiredEmployee extends Employee {
private int pension;

public RetiredEmployee(int pension) {
	super();
	this.pension = pension;
}
public RetiredEmployee(int id, String name) {
	super(id, name);
	
}
public int getPension() {
	return pension;
}
public void setPension(int pension) {
	this.pension = pension;
}
@Override
public String toString() {
	return "RetiredEmployee [pension=" + pension + "]";
}



}

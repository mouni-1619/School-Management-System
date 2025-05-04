package org.SchoolManagement.EntityClass.com;

public class Student extends Person {

	private int age;
	private String grabe;
	private Parent parent;
	private FeeDetails feeDetails;
	
	public Student(int id, String name, long adhaar, long mobile_No, String email, Addres addres,int age,String grade,Parent parent,FeeDetails fedetailds) {
		super(id, name, adhaar, mobile_No, email, addres);
		// TODO Auto-generated constructor stub
		this.age=age;
		this.parent=parent;
		this.feeDetails=fedetailds;
	}

	

@Override
public void showRole() {
	System.out.println(getName()+" is "+getGrabe()+" student");
}
public FeeDetails getFeeDetails() {
	return feeDetails;
}
public void setFeeDetails(FeeDetails feeDetails) {
	this.feeDetails = feeDetails;
}



public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGrabe() {
	return grabe;
}

public void setGrabe(String grabe) {
	this.grabe = grabe;
}

public Parent getParent() {
	return parent;
}

public void setParent(Parent parent) {
	this.parent = parent;
}


}

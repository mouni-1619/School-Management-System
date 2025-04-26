package org.SchoolManagement.EntityClass.com;

public class Student extends Person {
	private int age;
	private String grabe;
	private Parent parent;
public Student(int id, String name, long adhaar, long mobile_No, String email, int age, String grabe, Parent parent) {
	super(id, name, adhaar, mobile_No, email);
	this.age = age;
	this.grabe = grabe;
	this.parent = parent;
}

@Override
public void showRole() {
	System.out.println(getName()+" is "+getGrabe()+" student");
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

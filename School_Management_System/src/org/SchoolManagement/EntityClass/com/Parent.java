package org.SchoolManagement.EntityClass.com;

public  class Parent extends Person {
    private Student s;
	public Parent(int id, String name, long adhaar, long mobile_No, String email,Student s) {
		super(id, name, adhaar, mobile_No, email);
		// TODO Auto-generated constructor stub
		this.s=s;
	}
	@Override
	public void showRole() {
		System.out.println(getName()+" is fother of "+s.getName());
		
	}


}

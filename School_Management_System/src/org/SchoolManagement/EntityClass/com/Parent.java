package org.SchoolManagement.EntityClass.com;

public  class Parent extends Person {
    public Parent(int id, String name, long adhaar, long mobile_No, String email, Addres addres,Student s) {
		super(id, name, adhaar, mobile_No, email, addres);
		this.s=s;
		// TODO Auto-generated constructor stub
	}
	private Student s;
	
	
	public Student getS() {
		return s;
	}


	public void setS(Student s) {
		this.s = s;
	}


	@Override
	public void showRole() {
		System.out.println(getName()+" is fother of "+s.getName());
		
	}

	


}

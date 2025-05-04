package org.SchoolManagement.EntityClass.com;

import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {
	private List<String> subject;
	public Teacher(int id, String name, long adhaar, long mobile_No, String email, Addres addres,List<String> subjects) {
		super(id, name, adhaar, mobile_No, email, addres);
		this.subject=subjects;
		
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	@Override
	public void showRole() {
		System.out.println(getName()+" teaches this subjects "+getSubject());
		
	}
	

}

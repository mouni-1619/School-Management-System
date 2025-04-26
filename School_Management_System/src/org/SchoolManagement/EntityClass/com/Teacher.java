package org.SchoolManagement.EntityClass.com;

import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {
	private List<String> subject;
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Teacher(int id, String name, long adhaar, long mobile_No, String email,List<String> subject) {
		super(id, name, adhaar, mobile_No, email);
		// TODO Auto-generated constructor stub
		this.subject=subject;
	}
	@Override
	public void showRole() {
		System.out.println(getName()+" teaches this subjects "+getSubject());
		
	}
	

}

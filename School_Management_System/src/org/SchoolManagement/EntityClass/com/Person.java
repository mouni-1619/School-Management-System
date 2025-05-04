package org.SchoolManagement.EntityClass.com;

public abstract class Person {
	private int id;
	private String name;
	private long adhaar;
	private long mobile_No;
	private String email;
	private Addres addres;
	public abstract void showRole();
	public Person(int id, String name, long adhaar, long mobile_No, String email, Addres addres) {
		super();
		this.id = id;
		this.name = name;
		this.adhaar = adhaar;
		this.mobile_No = mobile_No;
		this.email = email;
		this.addres = addres;
	}
	
	public Addres getAddres() {
		return addres;
	}
	public void setAddres(Addres addres) {
		this.addres = addres;
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
	public long getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}
	public long getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

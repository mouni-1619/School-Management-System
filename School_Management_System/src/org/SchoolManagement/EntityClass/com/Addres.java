package org.SchoolManagement.EntityClass.com;

public class Addres {
	 private String city;
	 private String state;
	 private int pincode;
	public Addres(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Addres [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	 
}

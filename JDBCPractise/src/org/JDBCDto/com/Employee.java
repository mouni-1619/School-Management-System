package org.JDBCDto.com;

import java.time.LocalDate;

public class Employee {
	 private int employeeId;
	    private String name;
	    private String jobTitle;
	    private int age;
	    private double salary;
	  public Employee(){}
	  
		public Employee( String name, String jobTitle, int age,
				double salary) {
			super();
			this.name = name;
			this.jobTitle = jobTitle;
			this.age = age;
			this.salary = salary;
			
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", name=" + name 
					+ ", jobTitle=" + jobTitle + ", age=" + age 
					+ ", salary=" + salary +  "]";
		}
	    

}

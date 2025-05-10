package org.CustomerTask.com;

public class Customer {
	 private String id;
	    private String name;
	    private String country;
	    private int age;
	    private int yearsOfMembership;
	    private double balance;
	    private int loyaltyScore;
	    private int numberOfTransactions;
		public Customer(String id, String name, String country, int age, int yearsOfMembership, double balance,
				int loyaltyScore, int numberOfTransactions) {
			super();
			this.id = id;
			this.name = name;
			this.country = country;
			this.age = age;
			this.yearsOfMembership = yearsOfMembership;
			this.balance = balance;
			this.loyaltyScore = loyaltyScore;
			this.numberOfTransactions = numberOfTransactions;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getYearsOfMembership() {
			return yearsOfMembership;
		}
		public void setYearsOfMembership(int yearsOfMembership) {
			this.yearsOfMembership = yearsOfMembership;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public int getLoyaltyScore() {
			return loyaltyScore;
		}
		public void setLoyaltyScore(int loyaltyScore) {
			this.loyaltyScore = loyaltyScore;
		}
		public int getNumberOfTransactions() {
			return numberOfTransactions;
		}
		public void setNumberOfTransactions(int numberOfTransactions) {
			this.numberOfTransactions = numberOfTransactions;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", country=" + country + ", age=" + age
					+ ", yearsOfMembership=" + yearsOfMembership + ", balance=" + balance + ", loyaltyScore="
					+ loyaltyScore + ", numberOfTransactions=" + numberOfTransactions + "]";
		}


}

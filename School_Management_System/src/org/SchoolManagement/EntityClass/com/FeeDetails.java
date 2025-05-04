package org.SchoolManagement.EntityClass.com;

public class FeeDetails {
	private double totalFees;
    private double feesPaid;
	public FeeDetails(double totalFees, double feesPaid) {
		super();
		this.totalFees = totalFees;
		this.feesPaid = feesPaid;
	}

     public double getRemainingFees() {
	        return totalFees - feesPaid;
	    }
	public double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}

}

package com.five.assignment;

// A Bank gives Personal loans, Home Loans on interest. Create two classes PersonalLoan, HomeLoan .
//  create necessary methods and attributes for setting/getting the loan percentages, LoanAmount,   Number of months, Person. Create different Objects of the  class and access the methods.
 


public class LoanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalLoan percLoan=new PersonalLoan(12.5f, 33450000.00, 60, "Neel Mani", "Bangalore", 7031219880L);
		HomeLoan homeLoan=new HomeLoan(14.9f, 3800000.00, 240, "Sanjay", "Patna", 7031219800L);
		
		System.out.println("Personal Loan details-");
		System.out.println("Percentage: "+percLoan.getLoanPerc()+"%");
		System.out.println("Amount: "+percLoan.getLoanAmount());
		System.out.println("Duration: "+percLoan.getLoanDuration());
		System.out.println("Name: "+percLoan.getPersonDetails().getName());
		System.out.println("Address: "+percLoan.getPersonDetails().getCity());
		System.out.println("Contact No.- "+percLoan.getPersonDetails().getCity());
		System.out.println("================================");
		System.out.println("Home Loan details-");
		System.out.println("Percentage: "+homeLoan.getLoanPerc()+"%");
		System.out.println("Amount: "+homeLoan.getLoanAmount());
		System.out.println("Duration: "+homeLoan.getLoanDuration());
		System.out.println("Name: "+homeLoan.getPersonDetails().getName());
		System.out.println("Address: "+homeLoan.getPersonDetails().getCity());
		System.out.println("Contact No.- "+homeLoan.getPersonDetails().getCity());
	
	}

}

package com.four.assignment;

// Using the ordinary methods try to access static variables and test what happens

public class AccessingStatic {
	public static String company="Publicis Sapient";
	public static String name="Neel Mani";
	public static int pincode=560029;
	
	public void ordinaryMethod() {
		System.out.println(company+"    |   "+name+"    |    "+pincode);
	}
	public static void main(String[] args) {
		
		AccessingStatic as=new AccessingStatic();
		as.ordinaryMethod();
	}

}

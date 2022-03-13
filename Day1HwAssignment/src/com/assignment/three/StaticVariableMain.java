package com.assignment.three;
//Create a static variable and test all possible ways of accessing it from the same class and different class//
public class StaticVariableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accessing static variable from another class using class "
				+ "reference: "+StaticVariable.variable);
		
		/*
		 * Static members are part of the 
		 * class memory 
		 */
		StaticVariable variable=new StaticVariable();
		System.out.println("Accessing static variable from another class using Object "
				+ "reference: "+variable.variable);
	}

}

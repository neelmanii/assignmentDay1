package com.assignment.eight;

//Create a Student class.
//1) create a default constructor
//2) over load the constructor
//3) Delete the default constructor keeping the overloaded constructor and test the behavior


public class Student {

	private String name;
	private String collegeName;
	private float marks;
	
//	public Student() {
//		
//	}
	public Student(String name,String collegeName,float marks) {
		this.name=name;
		this.collegeName=collegeName;
		this.marks=marks;
	}
	
	public float getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
//		Student s=new Student();
		Student s1=new Student("Neel Mani","Haldi Institute of Technology",62.3f);
		
		System.out.println(s1.getCollegeName());
		System.out.println(s1.getName());
        System.out.println(s1.getMarks());
		/*
		 *without default constructor we can only create the object using the parameterized constructor 
		 */
	}
	

}

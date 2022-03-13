package com.seven.assignment;

//Create the following methods
//hello(int i), hello(byte i) hello(short i), hello(long i)
//when you call hello(5) which method is called & why.



public class MethodDemo {

	
		void hello(int i) {
			System.out.println("Inside hello(int i)");
		}
		void hello(byte i) {
			System.out.println("Inside hello(byte i)");
		}
		void hello(short i) {
			System.out.println("Inside hello(short i)");
		} 
		void hello(long i) {
			System.out.println("Inside hello(long i)");
		}
		public static void main(String[] args) {
			MethodDemo mt=new MethodDemo();
			mt.hello(5);
			/*
			 * it will invoke the method with int parameter.
			 * The compiler makes this decision at compile time. It identifies the type of the provided arguments,
			 *  and then it searches for the best match.
				The important thing is that overloading is compile time only.
				
				Using the cast we can instruct the compiler to select hello(short)
			 */
			mt.hello((short) 5);
			mt.hello((long) 5);
			mt.hello((byte) 5);
			
		}
	}



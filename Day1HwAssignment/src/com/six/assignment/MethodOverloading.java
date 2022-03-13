package com.six.assignment;

//Test Method Overloading in different ways.

public class MethodOverloading {

	
		public void add() {
			System.out.println("Zero paramaterized add()");
		}
		public int add(int i, int j) {
			System.out.println("add(int int) = "+(i+j));
			return i+j;
		}
		public double add(double d, int i) {
			System.out.println("add(double int) = "+(i+d));
			return d+i;
		}
		public double add(int i, double d) {
			System.out.println("add(int double) = "+(i+d));
			return i+d;
		}
		public void add(int i, int j, int k) {
			System.out.println("add(int int int) = "+(i+j+k));
		}
		public static void main(String[] args) {
			MethodOverloading mo=new MethodOverloading();
			mo.add();
			mo.add(5,8);
			mo.add(7.32,8);
			mo.add(9,43.67);
			mo.add(6,7,9);

	}

}

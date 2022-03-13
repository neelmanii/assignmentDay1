package com.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("provide the no");
           int no=s.nextInt();
           int fact=1;
           for(int i=1;i<=no;i++)//using for loop
           {
        	   fact=fact*i;
           }
           System.out.println("factorial of"+no+"is"+fact);
	}

}

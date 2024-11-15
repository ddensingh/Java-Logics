package com.java.Logics;
import java.util.Scanner;
public class Reversing_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int data=0;
	while(a>0) {
		int last = a%10;
		data=(data*10)+last;  
		a/=10;
	}
	System.out.println("Enter a Number To Reverse A Number"+data);
}
}

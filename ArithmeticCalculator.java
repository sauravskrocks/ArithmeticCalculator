package com.fsd.phase1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 Numbers for Arithmetic Calculation: ");
		
		System.out.println("Enter 1st Number: ");
		Scanner num1=new Scanner(System.in);
		double number1=num1.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		double number2=num1.nextInt();
		Scanner num2=new Scanner(System.in);
		
		ArithmeticCalculator AriCal = new ArithmeticCalculator();
		
		double addResult= AriCal.add(number1,number2);
		double subsResult= AriCal.subs(number1,number2);
		double multResult= AriCal.mult(number1,number2);
		double divResult= AriCal.div(number1,number2);
		
		System.out.println("Arithmetic Operation on the Entered Number is: ");
		System.out.println("Addition is: " +number1+ " + " +number2+ " = " +(addResult));
		System.out.println("Substraction is: " +number1+ " - " +number2+ " = " +(subsResult));
		System.out.println("Multiplicationis: "+number1+ " * " +number2+ " = " +(multResult));
		System.out.println("Divisionis: " +number1+ " / " +number2+ " = " +(divResult));
		
	}
	
	public double add(double num1, double num2) {
		return num1+num2;
		
	}
	
	public double subs(double num1, double num2) {
		return num1-num2;
		
	}
	
	public double mult(double num1, double num2) {
		return num1*num2;
		}
	
	public double div(double num1, double num2) {
		return num1/num2;
	}

}
package com.LineComparision;

import java.util.Scanner;

public class LineComparision {
	Scanner sc = new Scanner(System.in);
	public void LengthofLine() {
				//Take the values from the user
		System.out.print("Enter the value of X1 :-");
			int X1 =sc.nextInt();
		System.out.print("Enter the value of Y1 :-");
			int Y1 =sc.nextInt();
		System.out.print("Enter the value of X2 :-");
			int X2 =sc.nextInt();
		System.out.print("Enter the value of Y2 :-");
			int Y2 =sc.nextInt();
			//Computation
		double lenghtOfLine= Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1)) ;   //Calculate the distance between two points
			System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is  "+String.format("%.2f",lenghtOfLine));
			
			}
	
	public void LengthofLine2() {
		
		System.out.print("Enter the value of X3 :-");
			int X1 =sc.nextInt();
		System.out.print("Enter the value of Y3 :-");
			int Y1 =sc.nextInt();
		System.out.print("Enter the value of X4 :-");
			int X2 =sc.nextInt();
		System.out.print("Enter the value of Y4 :-");
			int Y2 =sc.nextInt();
			//Computation
		double lenghtOfLine2= Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1)) ;		//Calculate the distance between two points
			System.out.println("Distance between "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is  "+String.format("%.2f",lenghtOfLine2));
		}

	public static void main(String[] args) {
		
		LineComparision obj1 =new LineComparision();  //Creating object
			obj1.LengthofLine();   		
			obj1.LengthofLine2();
			
	}

}

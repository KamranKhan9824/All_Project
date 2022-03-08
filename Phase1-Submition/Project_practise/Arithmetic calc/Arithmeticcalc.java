package Practiseproject;

import java.util.Scanner;

public class Arithmeticcalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first numbers: ");
		int A=sc.nextInt();
		
		System.out.print("Enter the second numbers: ");
		
		int B= sc.nextInt();
		System.out.println("\nEnter the operator (/, *, +, -):  ");
		
		char op=sc.next().charAt(0);
		
		double res=0;
		
		switch(op){
		case '+': res=A+B;
		break;
		case '-':res=A-B;
		break;
		case '*': res=A*B;
		break;
		case '/':res=A+B;
		break; }
		System.out.println("\nThe answer is: " +res);
		}

	}



package Assistepractise;
import java.util.*;

public class ArithCalc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First numbers: ");
		int A=sc.nextInt();
		
		
		System.out.print("Enter the second numbers: ");
		int B= sc.nextInt();
		
		System.out.print("Enter the operator: ");
		char or=sc.next().charAt(0);
		double res=0;
		
		switch(or){
			case '+': res=A+B;
				break;
			case '-':res=A-B;
				break;
			case '*': res=A*B;
				break;
			case '/':res=A/B;
				break;
		}
		System.out.println("The answer is: " +res);

	}

}

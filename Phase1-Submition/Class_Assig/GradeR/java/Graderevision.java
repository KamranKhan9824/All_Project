package GradeR.java;
import java.util.*;

class Grade_Revision{
	
	String name; //to store name of the employee

	int bas; // to store basic salary

	int expn;   //to consider the length of service as an experience

	double inc;   //to store increment

	double nbas;  //to store new basic salary (basic + increment)
	
	public Grade_Revision()
	{
		name="";
		bas=0;
		expn=0;
		inc=0;
		nbas=0;
		
	}
	
	void accept(){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Name:-");
	     name=sc.nextLine();
	     
	     System.out.print("Enter the Basic Sal:-");
	     bas=sc.nextInt();
	     
	     System.out.print("Enter the Experience:-");
	     expn=sc.nextInt();
	}
	void increment(){
		
		if(expn<=3)
		{
			inc= 1000 + (bas * 0.1);
		}
		else if(expn>=3 || expn<=5){
		 inc=3000+(bas * 0.12);	
		}
		else if(expn>5 || expn==10){
			inc=5000+(bas*0.15);
		}
		else{
			inc=8000+(bas*0.20);
		}
		nbas=inc+bas;
	}
	void display()
	{
		
			System.out.println("\nName of Employee: "+name);
			System.out.println("Basic Salary :"+bas);
			System.out.println("Experience of Employee: "+expn);
			System.out.println("Increment in Salary: "+inc);
			System.out.println("New Basic Salary: "+nbas);
	}
	
}

public class Graderevision {

	public static void main(String[] args) {
		Grade_Revision gr1= new Grade_Revision();
		gr1.accept();
		gr1.increment();
		gr1.display();
		
	}

}

package Packagep1.java;

public class P {

	public void methodpublic3()
	{
		 System.out.println("Public method of pckg1 and class p");
		 methodprivate3();
		 methodprotected3();
		 methoddefault3();
	} 
	protected void methodprotected3()
	{
		 System.out.println("Protected method of pckg1 and class p");
		// methodprivate2();
	}
	void methoddefault3()
	{
		 System.out.println("default method of pckg1 and class p");
		 //methodprivate2();
	}
		
	private void methodprivate3()
	{
		 System.out.println("Private method of pckg1 and class p");
	}
 
 
 
public static void main(String[] args) {
	
		M m1=new M(); //object of class m
		N n1= new N(); //object of class n
		
		// System.out.println(m1.num1);  //Private variable of m
		 System.out.println(m1.l1);
		 System.out.println(m1.f1);
		 System.out.println(n1.num2);
		 System.out.println(n1.i1);
		 System.out.println(n1.d1);
		 
		 
}
	}
	

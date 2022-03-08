package packagep2.java;

import Packagep1.java.N;
import Packagep1.java.M;

public class Y extends N{

	public static void main(String[] args) {
		
		// Displaying variables of X class
		X x1 = new X(); 
		System.out.println(x1.c1);
		System.out.println(x1.ff1);
		System.out.println(x1.l1);
		
		//Calling all the function of N
		//First converted all defa, priv, and protected method to public
		N n1= new N();
		n1.methodpublic2();
		
		System.out.println("******************************");
		
		//Calling all the function of N
		//First converted/moved  all defa, priv, and protected method to public
		M m1=new M();
		m1.methodpublic1();
		
		
	}

}

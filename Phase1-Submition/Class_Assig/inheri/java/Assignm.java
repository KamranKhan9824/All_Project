package inheri.java;

class Product{
	 int id=70;
	 String name="Amul";
	
	void DisP(){
		System.out.println("Name is:- "+name);
		System.out.println("ID is:- "+id);
		
	}
} 

class A extends Product
{
	 int count=50;
	 String category="Butter";
	
	void DisPA(){
		System.out.println("Count is:- "+count);
		System.out.println("Category is:- "+category);
		
	}
	
}
class B extends Product
{
	 int count=90;
	 String category="Milk";
	
	void DisPB(){
		System.out.println("Count is:- "+count);
		System.out.println("Category is:- "+category);
		
	}
}
class C extends Product{
	 int count=56;
	 String category="Choco";
	
	void DisPC(){
		System.out.println("Count is:- "+count);
		System.out.println("Category is:- "+category);
		
	}
	
}

class SubA extends A{
	int price=30;
	void DisPsubA(){
		
		int Totalprice=count*price;
	
		System.out.println("Price is:- "+price);
		System.out.println("Total count of sub A is :-"+Totalprice);
		//System.out.println("Category is:- "+category);
		
	}
}
class SubB extends B{
	int price=10;
	
	void DisPsubB(){
		int Totalprice=count*price;
	
		System.out.println("Price is:- "+price);
		System.out.println("Total count of sub B:-"+Totalprice);
	
}	
	
}

public class Assignm {

	public static void main(String[] args) {
		SubA s1=new SubA();
		s1.DisP();
		
		s1.DisPA();
		s1.DisPsubA();
		
		SubB s2=new SubB();
		s2.DisPB();
		s2.DisPsubB();
		
		//s2.DisPsubB();
		
		C c1= new C();
		c1.DisPC();
	}

}

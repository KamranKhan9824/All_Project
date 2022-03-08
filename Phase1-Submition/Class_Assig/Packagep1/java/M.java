package Packagep1.java;

public class M {
	//vaiables of class M
	private int num1= 10;
	long l1= 100000L;
	protected float f1= 25.50f;
	
	public void methodpublic1()
	{
		System.out.println("Value of num1 private in M :" +num1);
		System.out.println("Public method of pckg1 and class m");
		//methodprotected1();
		//methoddefault1();
		//methodprivate1();
	} 
	protected void methodprotected1()
	{
		System.out.println("Protected method of pckg1 and class m");
	}
	void methoddefault1()
	{
		System.out.println("default method of pckg1 and class m");
	}
	
	private void methodprivate1()
	{
		System.out.println("Private method of pckg1 and class m");
	}

}

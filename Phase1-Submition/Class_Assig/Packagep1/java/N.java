package Packagep1.java;

 public class N {
	 //variables of class N
	 protected long num2=265154L;
	  public int i1= 50;
	  double d1= 15.10d;
	  
    public void methodpublic2()
	{
		 System.out.println("Public method of pckg1 and class n");
		 methodprivate2();
		 methodprotected2();
		 methoddefault2();
	} 
	protected void methodprotected2()
	{
		 System.out.println("Protected method of pckg1 and class n");
		 methodprivate2();
	}
	void methoddefault2()
	{
		 System.out.println("default method of pckg1 and class n");
		 methodprivate2();
	}
		
	private void methodprivate2()
	{
		 System.out.println("Private method of pckg1 and class n");
	}
}

package Assistepractise;


class Emp {

 class Inner {

     public void show()
     {
        System.out.println("Inside a inner class method");
     }
 }
}

public class InnerClass {

 public static void main(String[] args)
 {
	 Emp e=new Emp();
    Emp.Inner in = e.new Inner();

       in.show();
 }
}
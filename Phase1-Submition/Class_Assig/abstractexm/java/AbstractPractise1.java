package abstractexm.java;

abstract class MNC{
	abstract void m1();
	abstract void m2();
	
	MNC(){
		System.out.println("Constructor of MNC");
	}
	public void normm(){
		System.out.println("Normal method of class MNC");
	}
	
}
abstract class Infosys extends MNC{
	
	void m1(){
		System.out.println("Giving body to abs m1");
	}
	
	abstract void m2();
}
class Hello extends Infosys{
	@Override
	void m1(){
		System.out.println("Giving body to abs m1");
	}
	
	@Override
	void m2() {
		System.out.println("Giving body to abs m2");
		
	}
	public void normm(){
		System.out.println("Normal method of Class Hello");
	}
	
}
public class AbstractPractise1 {

	public static void main(String[] args) {
		MNC obj=new Hello();
		Infosys obj1=new Hello();
		obj.m1();
		obj.m2();
		obj.normm();
		//obj1.normm();
		//obj1.m2();
		//obj1.normm();

	}

}

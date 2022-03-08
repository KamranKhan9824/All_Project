package Assistepractise;
class AccesMod{
	
	private void message(){
		System.out.println("Accesesable only within class");
	}
	
	void message1(){
		System.out.println("\nDefault: Accesesable only within class and within package");
	}
	protected void message2(){
		System.out.println("\nProtected: Accesesable in within class and within package");
		
		System.out.println("\nProtected: Accesesable outside class by subclass only after extends the parent class");
	}
	public void message3(){
		System.out.println("\nPublic: Accesesable to All");
		
	}
	
}


public class Accessmod {

	public static void main(String[] args) {
		AccesMod a1=new AccesMod();
		a1.message1();
		a1.message2();
		a1.message3();

	}

}

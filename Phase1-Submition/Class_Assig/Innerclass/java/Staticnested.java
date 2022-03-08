package Innerclass.java;

class Motherboard{
	static class usb{
	int usb=10;
	int usb1=5;
	
	int getTotalPrice(){
		return usb+usb1;
	}
	
	static void disp(){
		System.out.println("We are into static method of inner class");
	}
	}
}
public class Staticnested {

	public static void main(String[] args) {
		
		Motherboard m= new Motherboard();
		
		Motherboard.usb us1= new Motherboard.usb();
					System.out.println("Total ports:-"+us1.getTotalPrice());
					Motherboard.usb.disp();
		
		

	}

}

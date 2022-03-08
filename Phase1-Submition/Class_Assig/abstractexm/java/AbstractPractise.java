package abstractexm.java;

abstract class vheicle{
	
	int speed;
	long dist;
	abstract void run();
	abstract void stop();
	
	public void fuel(int fuel){
		//fuel=100;
		System.out.println("The fuel is :-"+fuel);
	}
	public void fuel(float capcity,String name){
		capcity=55.5f;
		name="Indian oil";
		System.out.println("The capcity n type is :-"+capcity+name);
	}
	public void fuel(char ch,int pri){
		pri=120;
		ch='M';
		System.out.println("The ch n pri is :-"+ch+pri);
	}
	vheicle(){
		System.out.print("Default cons of vh\n");
	}
	vheicle(String str){
		System.out.println("para constructoer of vhei"+str);
	}
}

class Whl2 extends vheicle{
	int speed=500;
	long dist=6000;
	int no_of_tyre=2;
	
	Whl2(){
		System.out.println("inside 2w constrocter");
	}
	 @Override
	void run(){
		 System.out.println("Run method override");
	}
	 @Override
	void stop(){
		 System.out.println("Stop method override");
		 
	 }
	
	
 public void display()
 {
		System.out.println(super.speed);
		System.out.println(super.dist);
		System.out.println(speed);
		System.out.println(dist);
		System.out.println(no_of_tyre);
		
	}
}

class Whl3 extends vheicle{
	int speed=700;
	long dist=8000;
	int no_of_tyre=3;
	
	Whl3(){
		System.out.println("inside 3w constrocter");
	}
	@Override
	void run(){
		 System.out.println("Run method override");
	}
	 @Override
	void stop(){
		 System.out.println("Stop method override");
		 
	 }
	
	
	void display(){
		System.out.println(super.speed);
		System.out.println(super.dist);
		System.out.println(speed);
		System.out.println(dist);
		System.out.println(no_of_tyre);
		
	}
}
 class Whl4 extends vheicle{
	int speed=900;
	long dist=10000;
	int no_of_tyre=4;
	
	Whl4(){
		System.out.println("inside 4w constrocter");
	}
	@Override
	void run(){
		 System.out.println("Run method override");
	}
	 @Override
	void stop(){
		 System.out.println("Stop method override");
		 
	 }
	
	void display(){
		System.out.println(super.speed);
		System.out.println(super.dist);
		System.out.println(speed);
		System.out.println(dist);
		System.out.println(no_of_tyre);
		
	}
}
class Whl8 extends vheicle{
	int speed=1100;
	long dist=12000;
	int no_of_tyre=8;
	
	Whl8(){
		System.out.println("inside 8w constrocter");
	}
	@Override
	void run(){
		 System.out.println("Run method override");
	}
	 @Override
	void stop(){
		 System.out.println("Stop method override");
		 
	 }
	
	void display(){
		System.out.println(super.speed);
		System.out.println(super.dist);
		System.out.println(speed);
		System.out.println(dist);
		System.out.println(no_of_tyre);
		
	}
}


public class AbstractPractise {

	public static void main(String[] args) {
		vheicle v1= new Whl2();
		vheicle v2= new Whl3();
		vheicle v3= new Whl4();
		vheicle v4= new Whl8();
		
		v1.run();
		v1.stop();
		v2.run();
		//v1.display();
		v2.stop();
		v3.run();
		v3.stop();
		v4.run();
		v4.stop();
		
	}

}

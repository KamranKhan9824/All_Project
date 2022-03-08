package Innerclass.java;

class Member{
	private int date=20;
	void display(){
		System.out.println("Im inside outer class method");
	}
	class inner{
		private int date=10;
		
		void message(){
			Member.this.display();
			System.out.println("date is:"+date);
		}
	
		void display(){
			System.out.println("Im inside inner class method");
		}
	}
}
public class Innerclassexmp {

	public static void main(String[] args) {
		
		Member m= new Member();
		
		Member.inner in1= m.new inner();
		in1.display();
		in1.message();
	}

}

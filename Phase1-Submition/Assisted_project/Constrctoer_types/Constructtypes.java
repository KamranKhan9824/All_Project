package Assistepractise;

class Employe{
	int a;
	Employe(){
		System.out.println("DefaultConstructoer");
	}
	Employe(int a){
		this.a=a;
		System.out.println("parameterized constructoer");
	}
	public void disp(){
		System.out.println("Value of a"+a);
	}
}

public class Constructtypes {

	public static void main(String[] args) {
		Employe e=new Employe();
		Employe e1=new Employe(10);
		e1.disp();

	}

}

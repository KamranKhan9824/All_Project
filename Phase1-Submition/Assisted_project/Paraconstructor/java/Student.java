package Paraconstructor.java;

public class Student {
	String name;
	int age;
	char Section;
	char gender;
	int sm1,sm2,sm3;
	int total;
	float avg;
	
	public Student(String name, int age,char Section,char gender,int sm1,int sm2,int sm3){
		
		this.name=name;
		this.age=age;
		this.Section=Section;
		this.gender=gender;
		this.sm1=sm1;
		this.sm2=sm2;
		this.sm3=sm3;
		total=sm1+sm2+sm3;
		avg=total/3;
	}
	public Student(String name,int age,char Section,char gender,int sm2,int sm3){
		this.name=name;
		this.age=age;
		this.Section=Section;
		this.gender=gender;
		this.sm2=sm2 ;
		this.sm3=sm3;
		total=sm2+sm3;
		avg=total/2;
	}
	//public Student(String n,int a,char s,char g,int ss2,int ss3)
	
	public void Disp(){
		
		System.out.println("---------Details of Student ------\n");
		System.out.println("Name:- "+name +"Age:- "+age + "Section:- " +Section  +"Gender:- " +gender  +"Sub1:- "+sm1 +"Sub2:- "+sm2+ "Sub3:- "+sm3 +"Total:- "+total+"Average:- "+avg);
		//System.out.println("---------Details of Student 2------\n");
		//System.out.println("Name:-\n"+name+"Age of stud1\n "+age+"Section:-\n"+Section+"Gender:-\n"+gender+"Sub1 Marks:-\n"+sm1+"Sub2 Marks:-\n"+sm2+"Sub3 marks:-\n"+sm3);
		//System.out.println("---------Details of Student 3------\n");
		//System.out.println("Name:-\n"+name+"Age of stud1\n "+age+"Section:-\n"+Section+"Gender:-\n"+gender+"Sub1 Marks:-\n"+sm1+"Sub2 Marks:-\n"+sm2+"Sub3 marks:-\n"+sm3);
		//System.out.println("---------Details of Student 4------\n");
		//System.out.println("Name:-\n"+name+"Age of stud1\n "+age+"Section:-\n"+Section+"Gender:-\n"+gender+"Sub1 Marks:-\n"+sm1+"Sub2 Marks:-\n"+sm2+"Sub3 marks:-\n"+sm3);
	}

	public static void main(String[] args) {
		Student s1=new Student("Kamran", 24, 'A', 'M',60, 80,75);
		Student s2=new Student("Junaid", 22, 'B', 'M',0,90,55);
		Student s3=new Student("Simon", 25, 'C', 'M',0,80,65);
		Student s4=new Student("Jhon", 26, 'D', 'M',40, 80,85);
	
		s1.Disp();
		s2.Disp();
		s3.Disp();
		s4.Disp();
	}

}


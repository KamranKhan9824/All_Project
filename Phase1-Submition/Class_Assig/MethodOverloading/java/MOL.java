package MethodOverloading.java;


public class MOL
	{
		public void area(float r)
		{
			float res=3.14f*r*r;
			System.out.println("Area of circle is:"+res);
		}
		public void area(int a, int b)
		{
			//Add two numbers
			int res1=a+b;
			System.out.println("Add two number is:"+res1);
		}
		public void area(float l,float w)
		{
			float res2=l*w;
			System.out.println("Area of rectangle is:"+res2);
		}


			
	public static void main(String[] args) {
				MOL m1=new MOL();
				m1.area(5);
				m1.area(5, 6);
				m1.area(10.5f, 12.3f);
				

			}

	}



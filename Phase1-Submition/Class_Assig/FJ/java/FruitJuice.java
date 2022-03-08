package FJ.java;

import java.util.*;

class FruitJ
{
	
	int product_code;     //stores the product code number

	String flavour;         //stores the flavour of the juice (e.g., orange, apple, etc.)

	String pack_type;       //stores the type of packaging (e.g., tera-pack, PET bottle, etc.)

	int pack_size;            //stores package size (e.g., 200 mL, 400 mL, etc.)

	int product_price;         //stores the price of the product


public FruitJ()
{
	
	product_code=0;
	flavour="";
	pack_type="";
	pack_size=0;
	product_price=0;
	
}
	void input()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the product_code:-");
		 product_code=sc.nextInt();
		 sc.nextLine();
		System.out.print("Enter the flavour:-");
		flavour=sc.nextLine();
		
		System.out.print("Enter the pack_type:-");
	     pack_type=sc.nextLine();
		
		System.out.print("Enter the pack_size:-");
	     pack_size=sc.nextInt();
		
		System.out.print("Enter the product_price:-");
		 product_price=sc.nextInt();
		
		
		//System.out.println("product_code:-"+product_code+"Flavour:-"+flavour+"pack_type:-"+pack_type+"pack_size:-"+pack_size+"product_price:-"+product_price);
	}
	void discount()
	{
		//float Discount=product_price/100*10;
		product_price-=10;
	}
	void display()
	{
		System.out.println("product_code:-"+product_code);
		System.out.println("Flavour is :-"+flavour);
		System.out.println("pack_type:-"+pack_type);
		System.out.println("pack size :-"+pack_size);
		System.out.println("product_price:-"+product_price);
		System.out.println("Discount is :-"+product_price);
		
	}

}


public class FruitJuice {

	public static void main(String[] args) {
		FruitJ f1=new FruitJ();
		f1.input();
		f1.discount();
		f1.display();


	}

}

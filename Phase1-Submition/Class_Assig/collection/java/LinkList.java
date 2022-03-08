package collection.java;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("May");
		l1.add("June");
		l1.add("July");
		l1.add("August");
		l1.add("April");
		l1.add("November");
		
		System.out.println(" 6 months:- "+l1);
		
		l1.addLast("December");
		System.out.println("Added in last :- "+l1);
	
		l1.addFirst("January");
		System.out.println("Added First:- "+l1);
		
		l1.add(2, "March");
		System.out.println("index add:- "+l1);
		
		l1.add(1, "February");
		System.out.println("index add:- "+l1);
		
		l1.add(8, "September");
		System.out.println(" index add:- "+l1);
		
		l1.add(9, "October");
		System.out.println(" index add:- "+l1);
		
		
		System.out.println(" Calender:- "+l1);
		
		l1.remove("May");
		System.out.println(" Removing Birthday month:- "+l1);
		
		 Iterator itr= l1.iterator();
		
        System.out.println("List elements : ");
  
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
  
        System.out.println(l1);
        System.out.println("Lenght is"+l1.size());
        for(int i=0;i<l1.size();i++){
        	if(i%2==0)
        		System.out.println(l1.get(i));
    
        }
        
       
       
		
		
	}

}

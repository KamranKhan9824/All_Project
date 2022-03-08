package Assistepractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		
		final HashSet st = new HashSet();
        st.add(2);
        st.add("Collection");
        st.add(5);
        System.out.println(st);
        st.remove(5);
        System.out.println(st);
        
        final LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(3);
        lhs.add("Java");
        lhs.add(9);
        System.out.println(lhs);
        
        final TreeSet<String> tr = new TreeSet<String>();
        tr.add("Python");
        tr.add("Java");
        tr.add("Cpp");
        System.out.println(tr);
        
    	ArrayList<String> city=new ArrayList<String>();   
	    city.add("Bangalore");//
	    city.add("Delhi"); 
	    city.add("Chennai");
	    System.out.println(city);  
	    
	    Vector<Integer> vec = new Vector();
	    vec.addElement(15); 
	    vec.addElement(30); 
	    vec.addElement(45);
	    System.out.println(vec);
	}

}

package collection.java;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Python");
		ts.add("Java");
		ts.add("Cpp");
		ts.add("Javascript");
		ts.add("Scala");
		ts.add("Ruby");
		System.out.println("^ languags are:-"+ts);
		
		ts.remove("Cpp");
		ts.remove("Ruby");
		System.out.println("Removed 2 languages"+ts);
		
		ts.add("Angular");
		ts.add("HTML");
		ts.add("Pascal");
		System.out.println("Added 3 more languags are:-"+ts);
		
		ts.clear();
		System.out.println("Clear:-"+ts);
	
	}

}

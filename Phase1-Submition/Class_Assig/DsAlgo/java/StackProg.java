package DsAlgo.java;

import java.util.Stack;

public class StackProg {

	public static void main(String[] args) {
		Stack st=new Stack();
		
		st.push("Ind");
		st.push("Eng");
		st.push("USA");
		st.push("UK");
		st.push("CAN");
		st.push("NZ");
		st.push("UAE");
		st.push("SA");
		st.push("BAN");
		st.push("ZIM");
		
		System.out.println(st);
		
		st.pop();
		st.pop();
		st.pop();
		
		System.out.println(st);
		
		st.push("Mango");
		st.push("Orange");
		st.push("Apple");
		
		System.out.println(st);

		st.peek();
		System.out.println(st);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st);
		
		int lctn=st.search("Ind");
		st.search("CAN");
		System.out.println(lctn);
		
		
	}

}

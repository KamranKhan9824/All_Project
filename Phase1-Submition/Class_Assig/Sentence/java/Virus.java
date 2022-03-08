package Sentence.java;
import java.util.*;

public class Virus {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:-");
		String st=sc.nextLine();
		int len=st.length();
		String word=""+st.charAt(0);
		
		for(int i=0;i<len;i++){
			char pt=st.charAt(i);
			if(pt==' '){
				word+=st.charAt(i+1);
				}
			}
		System.out.println("New Word:-"+word);
		
		
		
	}

}

package St.java;
import java.util.*;

public class Stringprog {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String:-");
		String st=sc.nextLine();
		String st1=st.toUpperCase();
		int len=st.length();
		int count=0;
		
		for(int i=0;i<len-1;i++){
			if(st.charAt(i)==st.charAt(i+1)){
				count++;
					}
			
		}
		System.out.println(count);
		System.out.println(st1);
		System.out.println(len);
	}

}

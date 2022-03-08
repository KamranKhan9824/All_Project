package DsAlgo.java;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter key to be search:-");
		
		int key=sc.nextInt();
		
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==key){
				System.out.println("element found at position:-"+i);
			}
		}

	}

}

package Assistepractise;

import java.util.Scanner;

public class StringFind {

	public static void main(String[] args) {
		final String[] strArray = { "Jhon", "Michel", "Joel" };
        boolean x = false;
        int in = 0;
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to be  searched:- ");
        final String str = sc.nextLine();
        for (int i = 0; i < strArray.length; ++i) {
            if (str.equals(strArray[i])) {
                in = i;
                x = true;
                break;
            }
        }
        if (x) {
            System.out.println(String.valueOf(str) + " String is found at index " + in);
        }
        else {
            System.out.println(String.valueOf(str) + " String is not found in the array");
        }

	}

}

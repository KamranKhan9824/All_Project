package Assistepractise;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:-");
        final int a = sc.nextInt();
        System.out.println("Enter Second number:-");
        final int b = sc.nextInt();
        try {
            final int c = a / b;
            System.out.println("Division is:-" + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Trying to divide by Zero");
            return;
        }
        finally {
            System.out.println("Always Run");
        }
        System.out.println("Always Run");

	}

}

package Assistepractise;
import java.util.*;

class WrongAgeException extends Exception  
{  
    public WrongAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
// class that uses custom exception SalaryException  
public class customException  
{  
  
    // method to check the salary  
    static void validate (int age) throws WrongAgeException{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new WrongAgeException("you ae below age");    
    }  
       else if (age >= 40 && age <= 75) {
    	   throw new WrongAgeException("your old");
       }
       else {   
    	   throw new WrongAgeException("you r young");  
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
        	System.out.print("Enter the age: ");
        	Scanner sc= new Scanner(System.in);
        	int a = sc.nextInt();
            // calling the method   
            validate(a);  
        }  
        catch (WrongAgeException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  

}

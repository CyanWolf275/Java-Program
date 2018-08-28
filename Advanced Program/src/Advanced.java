/*
 * Author: Michael
 * This program exports the sum of the two imported numbers except a is zero. 
 */
import java.util.Scanner;
public class Advanced {
	public static long test(long a, long b) {//Function define
		if (a==0) {
			return 0;
		}else {
			return (long)a+b;
		}
	}
	public static void error() {//Raise error function
		int error = 0/0;//ArithmeticException
	}
	public static void main(String[] args) {
		System.out.println("Author: Michael \nThis program exports the sum of the two imported numbers except a is zero. ");//Instructions
		long result = 0L;
		while (1==1) {//Infinite loop
			Scanner s = new Scanner(System.in); 
	        System.out.println("a: "); 
	        String A = s.nextLine(); //Input a
	        Scanner c = new Scanner(System.in); 
	        System.out.println("b: "); 
	        String B = c.nextLine(); //Input b
	        try {//In case the user enters invalid characters
	        	long AA =Long.parseLong(A);//String to long
	            long BB =Long.parseLong(B);
	            result = test(AA,BB);
	            if (AA>0 && BB>0 && result<0) {
	            	error();
	            }else if (AA<0 && BB<0 && result>0){
	            	error();
	            }//Error identifier
	            System.out.print("The sum of a and b is ");
	            System.out.print(result);
	            System.out.println(". ");//Output
	        }catch (ArithmeticException e1) {
	        	System.out.println("The sum of a and b is out of range. It should be between -9223372036854775808 and 9223372036854775807. ");//Sum range error message
	        }catch (NumberFormatException e2) {
	        	System.out.println("You must enter an integer between -9223372036854775808 and 9223372036854775807. ");//Input range error message
	        }
		}
	}
}	
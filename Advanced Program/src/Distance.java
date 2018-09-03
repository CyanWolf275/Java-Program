/*
 * Author: Michael
 * Math tool
 */
import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
		System.out.println("Format: (a,b),(c,d)");
		Scanner s = new Scanner(System.in); 
	    System.out.println("a: "); 
	    String A = s.nextLine();
	    int a = Integer.valueOf(A);
	    Scanner t = new Scanner(System.in); 
	    System.out.println("b: "); 
	    String B = s.nextLine();
	    int b = Integer.valueOf(B);
	    Scanner u = new Scanner(System.in); 
	    System.out.println("c: "); 
	    String C = s.nextLine();
	    int c = Integer.valueOf(C);
	    Scanner v = new Scanner(System.in); 
	    System.out.println("d: "); 
	    String D = s.nextLine();
	    int d = Integer.valueOf(D);
	    System.out.println(Math.sqrt((Math.pow((double)(a-c),2)+Math.pow(b-d,2))));
	}
}
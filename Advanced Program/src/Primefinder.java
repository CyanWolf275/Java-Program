/*
 * Author: Michael
 * Prime number finder
 */
import java.util.Scanner;
public class Primefinder {
	static int range = 1000;
	public static int mode(int num) {
		for(int i = num-1;i>1;i--) {
			if((num%i)==0) {
				return(0);
			}
		}
		return(1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
        System.out.println("Range: "); 
        String A = s.nextLine();
        try {
            range=Integer.parseInt(A);
    		for(int a = 2;a<=range;a++) {
    			if (mode(a)==1) {
    				System.out.println(a);
    			}
    		}
        }catch(Exception e) {
        	System.out.println("error");
        }
	}
}
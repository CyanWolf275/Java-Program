/*
 * Author: Michael
 * Advanced prime number finder
 */
import java.util.Scanner;
public class Advancedprimefinder {
	static int range = 1000;
	public static int mode(int num) {
		for(int i = num-1;i>1;i--) {
			//System.out.println(num%i);
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
    		for(int a = 1;a<=(int)(Math.sqrt(range-1));a++) {
    			if (mode((int)(Math.pow(a,2)+1))==1) {
    				System.out.println((int)(Math.pow(a,2))+1);
    			}
    		}
        }catch(Exception e) {
        	System.out.println("error");
        }
	}
}
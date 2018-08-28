/*
 * Author: Michael
 * Pythagorean number with two prime numbers
 */
import java.util.Scanner;
public class Advancedpythagorean {
	public static int mode(int num) {
		for(int l = num-1;l>1;l--) {
			if((num%l)==0) {
				return(0);
			}
		}
		return(1);
	}
	public static int range = 100;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
	    System.out.println("Range: "); 
	    String A = s.nextLine();//Input range
	    range = Integer.valueOf(A);
		for (int i = 1;i<range;i++) {
			for(int j = 1;j<range;j++) {
				for(int k = 1;k<range;k++) {
					if ((Math.pow(i, 2)+Math.pow(j, 2))==Math.pow(k, 2)&&i<j) {
						if(mode(i)==1&&mode(j)==1) {
							System.out.println(i+" "+j+" "+k);
						}else if(mode(i)==1&&mode(k)==1) {
							System.out.println(i+" "+j+" "+k);
						}else if(mode(j)==1&&mode(k)==1) {
							System.out.println(i+" "+j+" "+k);
						}
					}
				}
			}
		}
		System.out.println("End");
	}
}
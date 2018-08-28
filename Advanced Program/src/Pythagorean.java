/*
 * Author: Michael
 * Pythagorean number finder
 */
import java.util.Scanner;
public class Pythagorean {
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
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}
}
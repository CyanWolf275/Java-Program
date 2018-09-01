/*
 * Author: Michael
 * Self power number finder
 */
import java.util.Scanner;
public class Selfpower {
	static long range = 0;
	static long power = 3;
	static long su = 0;//Sum of the powers of each digit
	static String[] sta;
	static int pro2;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
        System.out.println("Range: "); 
        String A = s.nextLine();//Input range
        range=Long.parseLong(A);
        power = (long)A.length();//Level of power according to the number of digits
        try {
            for(long i = range;i>1;i--) {
            	String[] sta2 = Long.toString(i).split("");
            	String a = sta2[0];
            	String b = sta2[1];
            	String ab = a+b;
            	int pro = Integer.valueOf(ab);
            	if (pro<pro2) {
            		int progress = 100-Integer.valueOf(ab);
            		double prog = (double)progress/0.9;
            		System.out.println((int)prog+"%");//Progress monitor
            	}
                String[] arr = Long.toString(i).split("");//To array
            	for(long j = power;j>0;j--) {
            		long n = Long.parseLong(arr[(int) (j-1)]);//Separate each digit
            		long p = (long)Math.pow(n, power);//The power of each digit
            		su = su + p;//Add each digit's power to the sum
            	}
            	if (su==i) {
            		System.out.println(i);//Print self power numbers
            	}
            	su = 0;//Clear sum buffer
            	String[] sta = Long.toString(i).split("");
            	String c = sta[0];
            	String d = sta[1];
            	String cd = a+b;
            	pro2 = Integer.valueOf(cd);//Progress monitor
            }
        }catch(ArrayIndexOutOfBoundsException e) {//Only run in range's digit
        	System.out.println("End");
        }
	}
}
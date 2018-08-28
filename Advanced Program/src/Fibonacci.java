/*
 * Author: Michael
 * Fibonacci number generator
 */
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {//1,1,2,3,5,8,13,21
	static int range = 10;
	public static int[] insertElement(int original[],int element,int index){  
        int length=original.length;  
        int destination[]=new int[length+1];  
        System.arraycopy(original, 0, destination, 0, index);  
        destination[index]=element;  
        System.arraycopy(original, index, destination, index+1, length-index);
        return destination;
    }  
      
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
        System.out.println("Range: "); 
        String A = s.nextLine();//Input the number of terms
        range = Integer.parseInt(A);
		int array[] ={1,1,2};
        Arrays.sort(array);
        System.out.print("1 1 2");
        for (int i = 3;i<=range;i++) {
        	array=insertElement(array,array[i-1]+array[i-2],i);
        	System.out.print(array[i]+" ");
        }
	}
}
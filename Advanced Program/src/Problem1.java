public class Problem1 {
	public static int range = 1000000;
	public static int collatz(double num) {
		while (num!=1) {
			if (num%2==1) {
				num = 3.0*num + 1.0;
			}else {
				num = num / 2.0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		for(double i = 1.0;i<range;i++) {
			if (collatz(i)==1) {
				System.out.println(i+"   OK");
			}
		}
	}
}
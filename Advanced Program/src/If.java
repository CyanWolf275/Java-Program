public class If {
	public static void main(String[] args) {
		double d = Math.random();
		int e = 1 + (int)(d*5);
		if (e>3) {
			System.out.println("��");
		}else if (e<3) {
			System.out.println("С");
		}else {
			System.out.println("��");
		}
	}
}

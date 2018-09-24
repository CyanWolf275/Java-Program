public class Random {
	public static boolean ran(int poss) {
		int a = (int)(1+Math.random()*(100-1+1));
		if (a<=poss) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) {
		/*int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		for(int i =0 ;i<100000;i++) {
			int ran = (int)(1+Math.random()*(6-1+1));
			switch (ran) {
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			}
		}
		System.out.println(one+"\t"+two+"\t"+three+"\t"+four+"\t"+five+"\t"+six);
		System.out.println(one+two+three+four+five+six);*/
	}
}

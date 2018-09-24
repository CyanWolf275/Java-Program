/*
 * Author: Michael
 * “百转千回” 游戏模拟
 */
package game;
public class Test {
	public static int minus(int q) {
		if (q==0) {
			return 5;
		}else {
			return q-1;
		}
	}
	public static int plus(int r) {
		if (r==5) {
			return 0;
		}else {
			return r+1;
		}
	}
	public static void main(String[] args) {
		Player[] p= new Player[6];
		Player p0 = new Player();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();
		p[0]=p0;
		p[1]=p1;
		p[2]=p2;
		p[3]=p3;
		p[4]=p4;
		p[5]=p5;
		boolean x = true;
		int pl = -1;
		for (int i=1;i<100;i++) {
			if (x==true) {
				pl = plus(pl);
				if(p[pl].run(i)==2) {
					x=!x;
				}
				System.out.print(i+": ");
				System.out.println("Player: "+pl+" Alive: "+p[pl].alive+" Points: "+p[pl].point+" Skip: "+p[pl].skip+" Turn: "+p[pl].turn);
			}else {
				pl = minus(pl);
				if(p[pl].run(i)==2) {
					x=!x;
				}
				System.out.print(i+": ");
				System.out.println("Player: "+pl+" Alive: "+p[pl].alive+" Points: "+p[pl].point+" Skip: "+p[pl].skip+" Turn: "+p[pl].turn);
			}
		}
		for(int t = 0;t<=5;t++) {
			System.out.println("Points: "+t+" "+p[t].point+" "+p[t].rounds);	
		}
	}
}

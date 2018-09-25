package game;

public class Player {
	boolean turn = true;
	boolean skip = true;
	boolean alive = true;
	int point = 0;
	int rounds = 0;
	final int[] Possibility = {100,
			99,97,96,94,93,91,90,88,87,85,84,82,81,79,78,76,75,73,72,70,69,67,66,64,63,61,60,58,57,55,54,52,51,50,50,50,50,50,50,49,49,49,49,49,48,48,48,48,48,47,46,45,
			44,43,43,43,43,42,42,41,40,40,40,39,39,38,38,38,37,37,36,36,35,35,34,33,33,32,32,32,31,30,29,29,29,28,28,28,27,27,27,26,26,25,25,24,24,23,23,22,22,21,21,20,20,19,19,18,18,17,17,16,16,15,15,15,14,14,14};
	public int run(int round,Player P) {
		if (this.alive==false) {
			return 0;
		}
		rounds++;
		int poss = Possibility[round-1];
		int a = (int)(1+Math.random()*(100-1+1));
		if (P.skip==false&&P.turn==false&&P.alive==true&&this.turn==true) {
			this.turn=false;
			return 2;
		}
		if (a<=poss) {
			this.point++;
			return 1;
		}else {
			if (this.skip==true) {
				this.skip=false;
				return 1;
			}else if(this.turn==true){
				this.turn=false;
				return 2;
			}else {
				this.alive = false;
				return 0;
			}
		}
	}
}

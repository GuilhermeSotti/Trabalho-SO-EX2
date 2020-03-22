package control;

public class ThreadController extends Thread {

	static int VT[];
	static int [][] MT = new int [2][4]; 
	static String txt = "Thread ==>";
	
	private ThreadController (String txt, int MT){
		
		ThreadController.txt = txt;
		ThreadController.VT = new int[] {0,1,2,};
		ThreadController.MT = new int[2][4];
		
	}
	
	private static void calc(int x) {
		
		int y, T = 0;
		for (y = 0; y <= 4; y++) {
			
			T = T + MT[VT[x]][y];
		}
	}
	
	static Thread soma1 = new Thread(){
		
		public void run() {
			int x = 0;
			calc(x);
			
		}
	};
	static Thread soma2 = new Thread(){
		
		public void run() {
			int x = 0;
			calc(x);
			
		}
	};
	static Thread soma3 = new Thread(){
		
		public void run() {
			int x = 0;
			calc(x);
			
		}
	};
	
	public static void main(String[] args) {
		
		int i, x;
		
		for (i = 0; i <= 2 ; i++) {
			
			for(x = 0; x <= 4; i++) {
				
				MT[i][x] = (int) (Math.random()*11);
			}
		}
		
		soma1.start();
		soma2.start();
		soma3.start();
	}
}

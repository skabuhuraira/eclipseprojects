//1,1,2,3,5,8
public class Fibonacci {
	
	public static void main(String args[]) {
		
		printFib(15);
		
	}
	//not optimal--> check dynamic programming
	public static int fib(int n) {
		
		if (n >= 3) {
			return fib(n-1) +fib(n-2);
		} else {
			return 1;
		}
		
	}
	
	public static void printFib(int n) {
		int t1 =0;
		int t2=1;
		for (int i=1; i<=n; i++) {
			System.out.print(t1 + " , ");
			int sum =t1 +t2;
			t1 =t2;
			t2=sum;
		}
		
	}

}

//11 feet wide river. Frog on one side. there are 1 stone every 1 feet away. total 10 stones
//frog can jump 1 feet or 2 feet at a time
//how many ways are there for the frog to jump to other side considering it can never go backwards



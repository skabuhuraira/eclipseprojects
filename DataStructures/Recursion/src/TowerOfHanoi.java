
public class TowerOfHanoi {

	public static void main(String[] args) {
		move (10,'a','c','b');

	}
	
	
	public static void move(int n, char from, char to, char inter) {
		if(n == 1)
			System.out.println("Moving disc 1 from  "+ from + " to " + to);
		else {
			move(n-1, from,inter,to);
			System.out.println("Moving disc " +n+ " from " + from + " to " + to );
			move(n-1, inter, to, from);
		}
		
	}

}

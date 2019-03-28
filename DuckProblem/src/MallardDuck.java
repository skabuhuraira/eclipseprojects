
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackbehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I am a real Mallard Duck");
	}

}

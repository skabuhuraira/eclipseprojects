
public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackbehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I am a model Duck");
	}


}

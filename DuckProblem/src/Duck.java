
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackbehavior;
	
	public Duck (){
			}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackbehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float!!");
	}

	/*public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}*/

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	/*public QuackBehavior getQuackbehavior() {
		return quackbehavior;
	}*/

	public void setQuackbehavior(QuackBehavior qb) {
		quackbehavior = qb;
	}
	
	

}

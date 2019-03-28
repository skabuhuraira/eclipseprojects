
public class MiniDucksSimulator {
//Favor COMPOSITION OVER INTERITENCE
//IS-A vs HAS-A
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();

	}

}

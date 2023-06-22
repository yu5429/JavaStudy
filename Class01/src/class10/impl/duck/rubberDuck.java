package class10.impl.duck;

import class10.Duck;
import class10.impl.behavior.FlyNoWay;
import class10.impl.behavior.Squeak;

public class rubberDuck extends Duck {

	public rubberDuck(String kind) {
		super(kind);
		setQuackBehavior(new Squeak());
		setFlyBehavior(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println(this.getKind());
		this.performFlyBehavior();
		this.performQuackBehavior();
		
	}
	
}

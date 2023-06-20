package class10.impl.duck;

import class10.Duck;
import class10.impl.behavior.FlyWithWings;
import class10.impl.behavior.Quack;

public class mockupDuck extends Duck{
	
	public mockupDuck(String kind) {
		super(kind);
	}

	@Override
	public void display() {
		System.out.println(this.getKind());
		this.performFlyBehavior();
		this.performQuackBehavior();
	}

}

package class10.impl.duck;

import class10.Duck;
import class10.impl.behavior.FlyWithRocket;
import class10.impl.behavior.FlyWithWings;
import class10.impl.behavior.Quack;
import class10.impl.behavior.zing;

public class RocketDuck extends Duck {
	public RocketDuck(String kind) {
		super(kind);
		setQuackBehavior(new zing());
		setFlyBehavior(new FlyWithRocket());
	}

	@Override
	public void display() {
		System.out.println(this.getKind());
		this.performFlyBehavior();
		this.performQuackBehavior();
	}
}

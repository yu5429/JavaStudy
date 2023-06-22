package class10.impl.duck;

import class10.Duck;
import class10.impl.behavior.FlyWithWings;
import class10.impl.behavior.Quack;

public class mallard extends Duck {
	
	public mallard(String kind) {
		super(kind);
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println(this.getKind());
		this.performFlyBehavior();
		this.performQuackBehavior();
	}

}

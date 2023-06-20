package class10.impl.duck;

import class10.Duck;


public class redHeadDuck extends Duck {
	
	public redHeadDuck(String kind) {
		super(kind);
	}

	@Override
	public void display() {
		System.out.println(this.getKind());
		this.performFlyBehavior();
		this.performQuackBehavior();
		
	}

}

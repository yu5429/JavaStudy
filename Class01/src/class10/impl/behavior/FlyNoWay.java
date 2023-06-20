package class10.impl.behavior;

import class10.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못하다.");
		
	}

}

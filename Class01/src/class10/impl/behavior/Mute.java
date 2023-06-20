package class10.impl.behavior;

import class10.QuackBehavior;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("조용(무음)~");
		
	}

}

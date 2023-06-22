package coffee.beans;

import coffee.Beverage;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		setDescription("DarkRoast");
	}
	@Override
	public double cost() {
		return 500;
	}

}

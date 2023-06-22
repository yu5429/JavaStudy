package coffee.beans;

import coffee.Beverage;

public class Espresso extends Beverage {
	
	public Espresso() {
		setDescription("Espresso");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1000;
	}


}

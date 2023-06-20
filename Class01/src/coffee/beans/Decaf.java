package coffee.beans;

import coffee.Beverage;

public class Decaf extends Beverage {
	
	public Decaf() {
		setDescription("Decaf");
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 600;
	}

}

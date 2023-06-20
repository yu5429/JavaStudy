package coffee.beans;

import coffee.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		setDescription("HouseBlend");
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 500;
	}

}

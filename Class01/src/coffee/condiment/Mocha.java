package coffee.condiment;

import coffee.Beverage;
import coffee.Condiment;

public class Mocha extends Condiment {
	
	public Mocha(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public String getDescription() {
		Beverage beverage = this.getBeverage();
		return beverage.getDescription() +"Mocha";
	}

	@Override
	public double cost() {
		Beverage beverage = this.getBeverage();
		return beverage.cost()+1000;
	}

}

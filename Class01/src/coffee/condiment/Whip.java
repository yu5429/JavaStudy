package coffee.condiment;

import coffee.Beverage;
import coffee.Condiment;

public class Whip extends Condiment {
	
	public Whip(Beverage beverage) {
		setBeverage(beverage);
	}
	@Override
	public String getDescription() {
		Beverage beverage = this.getBeverage();
		return beverage.getDescription() +"Whip";
	}

	@Override
	public double cost() {
		Beverage beverage = this.getBeverage();
		return beverage.cost()+500;
	}

}

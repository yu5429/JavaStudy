package coffee.condiment;

import coffee.Beverage;
import coffee.Condiment;

public class water extends Condiment {

	@Override
	public String getDescription() {
		Beverage beverage = this.getBeverage();
		return beverage.getDescription() +"water";
	}

	@Override
	public double cost() {
		Beverage beverage = this.getBeverage();
		return beverage.cost()+300;
	}

}

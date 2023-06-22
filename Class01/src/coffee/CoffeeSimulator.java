package coffee;

import coffee.beans.DarkRoast;
import coffee.beans.Espresso;
import coffee.condiment.Milk;
import coffee.condiment.Mocha;
import coffee.condiment.Whip;

public class CoffeeSimulator {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		
		beverage = new Milk(beverage);
		beverage = new Whip(beverage);
		
		String coffee = "";
		if(beverage.getDescription().contains("EspressoMocha")) coffee = "모카에스프레소";
		if(beverage.getDescription().contains("EspressoMilk")) coffee = "카페라떼";
		
		
		System.out.println(coffee+"의 가격은"+beverage.cost());

	}

}

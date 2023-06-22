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
		if(beverage.getDescription().contains("EspressoMocha")) coffee = "��ī����������";
		if(beverage.getDescription().contains("EspressoMilk")) coffee = "ī���";
		
		
		System.out.println(coffee+"�� ������"+beverage.cost());

	}

}

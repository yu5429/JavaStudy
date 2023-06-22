package coffee;

public abstract class Condiment extends Beverage {
	private Beverage beverage;
	
	public abstract String getDescription();
	
	public Beverage getBeverage() {
		return beverage;
	}
	
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
}

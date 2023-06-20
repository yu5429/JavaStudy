package coffee;

public abstract class Beverage {
	
	private String discription="";
	
	public abstract double cost();
	
	public String getDescription() {
		return discription;
	}
	
	public void setDescription(String description) {
		this.discription = description;
	}
}

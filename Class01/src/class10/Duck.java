package class10;

public abstract class Duck {
	protected String kind;
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck(String kind) {
		this.kind = kind;
	}
	
	public void performFlyBehavior() {
		this.flyBehavior.fly();
	}
	
	public void performQuackBehavior() {
		this.quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	protected String getKind() {
		return this.kind;
	}
	
	public abstract void display();
}

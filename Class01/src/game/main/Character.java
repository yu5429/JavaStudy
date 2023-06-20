package game.main;

import java.util.Random;

public abstract class Character {
	
	protected String animal;

	
	private Attack attack;
	private Defence defence;
	private Grapple grapple;
	
	public Character(String animal) {
		this.animal = animal;
	}
	
	public void performAtteck() {
		this.attack.attack();
	}
	
	public void performDefence() {
		this.defence.defence();
	}
	
	public void performGrab() {
		this.grapple.grapple();
	}
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public void setDefence(Defence defence) {
		this.defence = defence;
	}
	
	public void setGrapple(Grapple grapple) {
		this.grapple = grapple;
	}
	
	protected String getAnimal() {
		return this.animal;
	}
	
	public abstract void display();
	public abstract void atk();
	public abstract void def();
	public abstract void grap();

}

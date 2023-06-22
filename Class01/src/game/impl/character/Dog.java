package game.impl.character;

import game.impl.behavior.Bite;
import game.impl.behavior.Grap;
import game.impl.behavior.Hand;
import game.main.Character;

public class Dog extends Character{

	public Dog(String animal) {
		super(animal);
		setAttack(new Bite());
		setDefence(new Hand());
		setGrapple(new Grap());
	}

	@Override
	public void display() {
		System.out.println("------------------------------");
		System.out.print(this.getAnimal()+" ");
		
	}

	@Override
	public void atk() {
		this.performAtteck();
		
	}

	@Override
	public void def() {
		this.performDefence();
		
	}
	
	@Override
	public void grap() {
		this.performGrab();
		
	}

}

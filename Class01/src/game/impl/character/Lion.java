package game.impl.character;

import game.impl.behavior.Bite;
import game.impl.behavior.Grap;
import game.impl.behavior.Hand;
import game.main.Character;

public class Lion extends Character {
	
	
	public Lion(String animal) {
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
		System.out.println("------------------------------");
	}

	@Override
	public void def() {
		this.performDefence();
		System.out.println("------------------------------");
		
	}
	
	@Override
	public void grap() {
		this.performGrab();
		System.out.println("------------------------------");
		
	}
}

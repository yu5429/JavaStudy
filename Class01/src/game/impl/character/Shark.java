package game.impl.character;

import game.impl.behavior.Dive;
import game.impl.behavior.Grap;
import game.impl.behavior.Jump;
import game.main.Character;

public class Shark extends Character {
	
	public Shark(String animal) {
		super(animal);
		setAttack(new Dive());
		setDefence(new Jump());
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

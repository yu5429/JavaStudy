package game.impl.character;

import game.impl.behavior.Grap;
import game.impl.behavior.Jump;
import game.impl.behavior.Kick;
import game.main.Character;

public class Rabbit extends Character {
	
	public Rabbit(String animal) {
		super(animal);
		setAttack(new Kick());
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

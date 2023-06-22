package game.impl.character;

import game.impl.behavior.Fly;
import game.impl.behavior.Wing;
import game.main.Character;

public class Eagle extends Character {

	public Eagle(String animal) {
		super(animal);
		setAttack(new Fly());
		setDefence(new Wing());
	}

	@Override
	public void display() {
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

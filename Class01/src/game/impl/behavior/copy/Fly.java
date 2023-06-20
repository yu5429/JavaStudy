package game.impl.behavior.copy;

import game.main.Attack;

public class Fly implements Attack{

	@Override
	public void attack() {
		System.out.println("공중 공격!");
		
	}
	
}

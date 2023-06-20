package class10;

import class10.impl.behavior.FlyNoWay;
import class10.impl.behavior.FlyWithWings;
import class10.impl.behavior.Mute;
import class10.impl.behavior.Quack;
import class10.impl.duck.RocketDuck;
import class10.impl.duck.mallard;
import class10.impl.duck.mockupDuck;
import class10.impl.duck.redHeadDuck;
import class10.impl.duck.rubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck Duck = new mallard("청둥오리");
		Duck.display();
		Duck = new mockupDuck("나무인형오리");
		Duck.setFlyBehavior(new FlyNoWay());
		Duck.setQuackBehavior(new Mute() );
		Duck.display();
		
		Duck = new redHeadDuck("빨간머리오리");
		QuackBehavior qb = new Quack() ;
		FlyBehavior fb = new FlyWithWings();
		Duck.setQuackBehavior(qb);
		Duck.setFlyBehavior(fb);
		Duck.display();
		
		Duck = new rubberDuck("고무인형오리");
		Duck.display();
		
		Duck = new RocketDuck("로켓덕");
		Duck.display();
	

	}

}

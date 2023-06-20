package class07;

import java.util.Random;

public abstract class mamalia {
	int[] track = new int[25]; //트랙 크기
	int leg = 0;
	Random ran = new Random();
	abstract void eat();
	abstract void sound();
	abstract void walk();
	abstract void run();
	abstract void range();

}

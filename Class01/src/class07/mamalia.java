package class07;

import java.util.Random;

public abstract class mamalia {
	int[] track = new int[25]; //Ʈ�� ũ��
	int leg = 0;
	Random ran = new Random();
	abstract void eat();
	abstract void sound();
	abstract void walk();
	abstract void run();
	abstract void range();

}

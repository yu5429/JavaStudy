package class05;

import java.util.Scanner;

public class driveCar {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		car myCar = new car("black", 200, 100, "포드", "익스플로러");
		
		
		myCar.drive();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedDown();
		myCar.speedUp();
		myCar.myCarStatus();
		

	}

}

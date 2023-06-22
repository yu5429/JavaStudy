package class06;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("출력을 원하는 구구단을 입력하세요.");
		System.out.println("모든 구구단 출력:10 특정 범위 출력: x");
		
		String val = i.nextLine();
		
		if (val.equals("x")) {
			System.out.println("시작 할 구구단을 입력하세요.");
			int start = i.nextInt();
			
			System.out.println("종료 할 구구단을 입력하세요.");
			int end = i.nextInt();
			
			guguScope myGugudan = new guguScope(start, end);
			myGugudan.showScope();

		} else {
			int num = Integer.parseInt(val);

			gugudan myGugudan = new gugudan(num);

			if (num == 10) {
				myGugudan.showAll();
			} else {
				myGugudan.show();
			}
		}
		
	}


}

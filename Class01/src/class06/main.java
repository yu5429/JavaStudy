package class06;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("����� ���ϴ� �������� �Է��ϼ���.");
		System.out.println("��� ������ ���:10 Ư�� ���� ���: x");
		
		String val = i.nextLine();
		
		if (val.equals("x")) {
			System.out.println("���� �� �������� �Է��ϼ���.");
			int start = i.nextInt();
			
			System.out.println("���� �� �������� �Է��ϼ���.");
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

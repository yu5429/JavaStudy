package class07;

public class dog extends mamalia{
	int dogRange;
	
	void frisbee() {
		System.out.println("�������� �������� �Ѵ�.");
	}

	@Override
	void eat() {
		System.out.println("�������� �Դ´�.");
		
	}

	@Override
	void sound() {
		System.out.println("�������� ¢�´�.");
		
	}

	@Override
	void walk() {
		System.out.println("�������� �ȴ´�.");
		
	}

	@Override
	void run() {
		range();
		for(int i=1; i<=track.length; i++) {
			if(i==leg) {
				System.out.print("[1]");
			} 
//			else if(leg>i) {
//				System.out.print("[>]");
//			}
			else {
				System.out.print("[ ]");
			}
		}
		System.out.println("������"+leg+"0m");
		
	}

	@Override
	void range() {
		leg += ran.nextInt(3)+1;
		if(leg>track.length)leg = track.length;
		dogRange = leg;
	}

}

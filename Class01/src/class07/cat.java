package class07;

public class cat extends mamalia {
	int catRange;
	
	void climb() {
		System.out.println("����̰� ���� ������.");
	}

	@Override
	void eat() {
		System.out.println("����̰� ���� �Դ´�.");
		
	}

	@Override
	void sound() {
		System.out.println("����̰� �ϾǰŸ���.");
		
	}

	@Override
	void walk() {
		System.out.println("����̰� �ȴ´�.");
		
	}

	@Override
	void run() {
		range();
		for(int i=1; i<=track.length; i++) {
			if(i==leg) {
				System.out.print("[2]");
			}
//			else if(leg>i) {
//				System.out.print("[>]");
//			}
			else {
				System.out.print("[ ]");
			} 
				
			
		}
		System.out.println("�����"+leg+"0m");
	}

	@Override
	void range() {
		leg += ran.nextInt(3)+1;
		if(leg>track.length)leg = track.length;
		catRange = leg;
		
		
	}

}

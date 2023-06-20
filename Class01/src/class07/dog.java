package class07;

public class dog extends mamalia{
	int dogRange;
	
	void frisbee() {
		System.out.println("강아지가 프리스비를 한다.");
	}

	@Override
	void eat() {
		System.out.println("강아지가 먹는다.");
		
	}

	@Override
	void sound() {
		System.out.println("강아지가 짖는다.");
		
	}

	@Override
	void walk() {
		System.out.println("강아지가 걷는다.");
		
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
		System.out.println("강아지"+leg+"0m");
		
	}

	@Override
	void range() {
		leg += ran.nextInt(3)+1;
		if(leg>track.length)leg = track.length;
		dogRange = leg;
	}

}

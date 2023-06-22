package class07;

public class cat extends mamalia {
	int catRange;
	
	void climb() {
		System.out.println("고양이가 벽을 오른다.");
	}

	@Override
	void eat() {
		System.out.println("고양이가 밥을 먹는다.");
		
	}

	@Override
	void sound() {
		System.out.println("고양이가 하악거린다.");
		
	}

	@Override
	void walk() {
		System.out.println("고양이가 걷는다.");
		
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
		System.out.println("고양이"+leg+"0m");
	}

	@Override
	void range() {
		leg += ran.nextInt(3)+1;
		if(leg>track.length)leg = track.length;
		catRange = leg;
		
		
	}

}

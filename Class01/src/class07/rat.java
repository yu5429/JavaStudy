package class07;

public class rat extends mamalia {
	int ratRange;
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void run() {
		range();
		for(int i=1; i<=track.length; i++) {
			if(i==leg) {
				System.out.print("[3]");
			}
//			else if(leg>i) {
//				System.out.print("[>]");
//			}
			else {
				System.out.print("[ ]");
			} 
				
			
		}
		System.out.println("Áã"+leg+"0m");
	}

	@Override
	void range() {
		leg += ran.nextInt(3)+1;
		if(leg>track.length)leg = track.length;
		ratRange = leg;
		
	}

}

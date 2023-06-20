package class06;

public class guguScope {
	int start;
	int end;
	
	public guguScope(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	void showScope() {
		for(int i=this.start; i<this.end+1; i++) {
			System.out.println(i + "´Ü" + "\n" + "------------");
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("------------");
		}
	}
	
}

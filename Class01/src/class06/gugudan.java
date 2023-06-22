package class06;

public class gugudan {
	int num;
	
	public gugudan(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	void show() {
		System.out.println(num + "´Ü" + "\n" + "------------");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
	}
	
	void showAll() {
		for(int i=1; i<10; i++) {
			System.out.println(i + "´Ü" + "\n" + "------------");
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("------------");
		}
	}
}

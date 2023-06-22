package class02;

public class EvenOddMain {

	public static void main(String[] args) {
		
		int start = 50;
		int end = 200;
		
		Colander colander = new ColanderImpl(end-start+1);
		
	
		colander.printEven();
		
		colander.odd();
		colander.printOdd();
	}

}

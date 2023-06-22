package class04;

public class EvenOddMain {

	public static void main(String[] args) {
		Colander colander = null;
		
		int kind = 1;
		int total = 150;
		if(kind == 0) {
			colander = new EvenColanderImpl(total);
		} else {
			colander = new OddColanderImpl(total);
		}

		colander.makeArray();
		colander.printArray();
	}

}

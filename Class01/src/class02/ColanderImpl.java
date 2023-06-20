package class02;

public class ColanderImpl implements Colander {
	private int[] totalNumbers;
	private int[] evenNumbers;
	private int[] oddNumbers;
	
	
	public ColanderImpl(int totalLength) {
		
		totalNumbers = new int[totalLength];
		
		for(int i = 0; i<totalLength; i++) {
			totalNumbers[i] = i;
		}
		
		
	}
	
	@Override
	public boolean even() {
		boolean result = false;
		try {
		
			int evenCnt = 0;
			
			for(int i=0; i < totalNumbers.length; i++) {
				if(totalNumbers[i]%2 == 0) {
					evenCnt++;
				}
			}
			evenNumbers = new int[evenCnt];
			
			//evenNumbers에 짝수 담기
			int evenIdx=0;
			for(int i = 0; i<totalNumbers.length; i++) {
				if(totalNumbers[i]%2 == 0) {
					evenNumbers[evenIdx] = totalNumbers[i];
					evenIdx++;
				}
			}
			result = true;
		} catch(Exception e) {
			evenNumbers = null;
			result = false;
		}
		return result;
	}

	@Override
	public boolean odd() {                        //try catch 사용
		boolean result = false;
		try {
			int oddCnt = 0;
			for(int i=0; i < totalNumbers.length; i++) {
				if(totalNumbers[i]%2 != 0) {
					oddCnt++;
				}
			}
			oddNumbers = new int[oddCnt];
			
			int oddIdx=0;
			for(int i = 0; i<totalNumbers.length; i++) {
				if(totalNumbers[i]%2 != 0) {
					oddNumbers[oddIdx] = totalNumbers[i];
					oddIdx++;
				}
			}
			
			result = true;
			
		} catch(Exception e) {
			oddNumbers = null;
			result = false;
		}
		
		return result;
	}

	@Override
	public void printEven() {
		if(evenNumbers ==null) {
			System.out.println("even 메소드 먼저 호출하세요.");
		} else {
			printArray(evenNumbers);
		}
	}

	@Override
	public void printOdd() {
		if (oddNumbers == null) {
			System.out.println("odd 메소드 먼저 호출하세요.");
		} else {
		printArray(oddNumbers);
		}
	}
	
	public void printArray(int[] array) {         //출력 메소드
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}

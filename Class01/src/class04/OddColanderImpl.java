package class04;

public class OddColanderImpl implements Colander {
	private int[] totalNumbers;
	private int[] oddNumbers;
	
	public OddColanderImpl(int totalLength) {
		
		totalNumbers = new int[totalLength];
		
		for(int i = 0; i<totalLength; i++) {
			totalNumbers[i] = i;
		}
		
		
	}
	@Override
	public boolean makeArray() {
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
	public void printArray() {
		if(oddNumbers ==null) {
			System.out.println("even 메소드 먼저 호출하세요.");
		} else {
			printArray(oddNumbers);
		}
	}
	
	public void printArray(int[] array) {         
	    // 출력 메소드		
	    for(int i=0; i<array.length; i++) {
	    	
	    	System.out.printf("%5d", array[i]);
	    	
	        if ((i + 1) % 5 == 0) { // 5개 요소마다 줄바꿈 추가
	            System.out.println();
	        }
	    }
	    System.out.println(); // 마지막 줄바꿈 추가
	}

}

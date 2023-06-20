package class04;

public class EvenColanderImpl implements Colander {
	private int[] totalNumbers;
	private int[] evenNumbers;
	
	public EvenColanderImpl(int totalLength) {
		
		totalNumbers = new int[totalLength];
		
		for(int i = 0; i<totalLength; i++) {
			totalNumbers[i] = i;
		}
		
		
	}
	@Override
	public boolean makeArray() {
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
				if(totalNumbers[i]%2 == 0 && totalNumbers[i] != 0) {
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
	public void printArray() {
		if(evenNumbers ==null) {
			System.out.println("even 메소드 먼저 호출하세요.");
		} else {
			printArray(evenNumbers);
		}
	}
	
	public void printArray(int[] array) {         
	    // 출력 메소드		
	    for(int i=0; i<array.length; i++) {
	    	
	    	if(array[i]==0)continue;
	    	System.out.printf("%5d", array[i]);
	    	
	        if ((i + 1) % 5 == 0) { // 5개 요소마다 줄바꿈 추가
	            System.out.println();
	        }
	    }
	    System.out.println(); // 마지막 줄바꿈 추가
	}

}

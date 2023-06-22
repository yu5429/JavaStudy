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
			
			//evenNumbers�� ¦�� ���
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
			System.out.println("even �޼ҵ� ���� ȣ���ϼ���.");
		} else {
			printArray(evenNumbers);
		}
	}
	
	public void printArray(int[] array) {         
	    // ��� �޼ҵ�		
	    for(int i=0; i<array.length; i++) {
	    	
	    	if(array[i]==0)continue;
	    	System.out.printf("%5d", array[i]);
	    	
	        if ((i + 1) % 5 == 0) { // 5�� ��Ҹ��� �ٹٲ� �߰�
	            System.out.println();
	        }
	    }
	    System.out.println(); // ������ �ٹٲ� �߰�
	}

}

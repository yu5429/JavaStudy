package class07;

public class main {

	public static void main(String[] args) {
		dog Maltese = new dog();
		cat persian = new cat();
		rat hamster = new rat();
		System.out.println("경기 시작!!!"+"\n");
		while(true) {
			Maltese.run();
			persian.run();
			hamster.run();
		
			if(persian.catRange>=25 && Maltese.dogRange<25 && hamster.ratRange<25) {
				System.out.println("고양이가 이겼습니다.");
				break;
			} else if (Maltese.dogRange>=25 && persian.catRange<25 && hamster.ratRange<25) {
				System.out.println("강아지가 이겼습니다.");
				break;
			}
			else if(hamster.ratRange>=25 && persian.catRange<25 && Maltese.dogRange<25) {
				System.out.println("쥐가 이겼습니다.");
				break;
			}
			else if(persian.catRange>=25 || Maltese.dogRange>=25 || hamster.ratRange>=25) {
				String str="";
				if(Maltese.dogRange>=25) str += "[강아지]";
				if(persian.catRange>=25) str += "[고양이]";
				if(hamster.ratRange>=25) str += "[쥐]";
				System.out.println(str+" 공동 1등");
				break;
			}
			
			System.out.println("\n");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println("경기 중단");
				break;
			}
		}
		
		System.out.println("경기 종료합니다.");

	}

}

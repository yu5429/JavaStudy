package class07;

public class main {

	public static void main(String[] args) {
		dog Maltese = new dog();
		cat persian = new cat();
		rat hamster = new rat();
		System.out.println("��� ����!!!"+"\n");
		while(true) {
			Maltese.run();
			persian.run();
			hamster.run();
		
			if(persian.catRange>=25 && Maltese.dogRange<25 && hamster.ratRange<25) {
				System.out.println("����̰� �̰���ϴ�.");
				break;
			} else if (Maltese.dogRange>=25 && persian.catRange<25 && hamster.ratRange<25) {
				System.out.println("�������� �̰���ϴ�.");
				break;
			}
			else if(hamster.ratRange>=25 && persian.catRange<25 && Maltese.dogRange<25) {
				System.out.println("�㰡 �̰���ϴ�.");
				break;
			}
			else if(persian.catRange>=25 || Maltese.dogRange>=25 || hamster.ratRange>=25) {
				String str="";
				if(Maltese.dogRange>=25) str += "[������]";
				if(persian.catRange>=25) str += "[�����]";
				if(hamster.ratRange>=25) str += "[��]";
				System.out.println(str+" ���� 1��");
				break;
			}
			
			System.out.println("\n");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println("��� �ߴ�");
				break;
			}
		}
		
		System.out.println("��� �����մϴ�.");

	}

}

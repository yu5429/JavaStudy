package game.main;

import java.util.Random;
import java.util.Scanner;

import game.impl.behavior.Bite;
import game.impl.character.Lion;
import game.impl.character.Shark;

public class GameSimulator {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int dmg = 0;
		int enemyDmg = 0;
		int userHp = 100;
		int enemyHp = 100;
		int ult = 0;
		int cpu = 0;
		int enemyUlt = 0;
		
		Character Character = new Shark("���");
		Character Enemey = new Lion("����");
		String me = Character.getAnimal();
		String e = Enemey.getAnimal();
		
		System.out.println("���� �����մϴ�!");
		System.out.println("����� ["+me+"] ���� ["+e+"]�Դϴ�.");
	
		
		String user = "";
		while(true) {
			if(enemyHp <= 0 && userHp >0){               
				System.out.println("����� �¸��߽��ϴ�!!!");
				break;
			}
			else if(enemyHp > 0 && userHp <= 0){
				System.out.println("��밡 �¸��߽��ϴ�...");
				break;
			}
			else if (enemyHp <= 0 && userHp <= 0) {
				System.out.println("���� ��� ü���� �����ϴ�. ���º�!!!");
				break;
			}
			
			
			
			if(ult >= 100) {
				System.out.println("���ϴ� �ൿ ��ȣ�� �Է��ϼ���.");
				System.out.println("[1:����] [2:���] [3:���] [4:�ʻ��]");
			} else {
				System.out.println("���ϴ� �ൿ ��ȣ�� �Է��ϼ���.");
				System.out.println("[1:����] [2:���] [3:���]");
			}
			user = s.nextLine();
			
			
			if(user.equals("1")) {               //���� �ൿ ���ý�
				System.out.println("������ �����ϼ̽��ϴ�.");
				cpu = ran.nextInt(3)+1;
				Character.display();
				Character.atk();
				
				if (enemyUlt < 100) {
					
					
					if (cpu == 1) {
						System.out.println("��뵵 ������ �����߽��ϴ�! ");
						System.out.println("���� ������ �ְ� �޽��ϴ�! ");
						dmg = ran.nextInt(10) + 1;
					
						userHp -= dmg;
						enemyHp -= dmg;
						if (dmg < 8) {
							ult += 20;
						}
						Enemey.display();
						Enemey.atk();
						System.out.println("���� ��� "+dmg+"�� �������� �޽��ϴ�.");

					} else if (cpu == 2) {
						System.out.println("���� �� �����߽��ϴ�! ");
						Enemey.display();
						Enemey.def();
						enemyDmg = ran.nextInt(10) + 1;
						System.out.println("�� ������ ��밡 ����߽��ϴ�! ��밡 ������ �¹޾��ƽ��ϴ�. ");
						System.out.println("�����" + enemyDmg + "�� �������� �޽��ϴ�.");
						userHp -= enemyDmg;
						enemyUlt +=20;
					} else if (cpu == 3) {
						System.out.println("���� ��⸦ �����߽��ϴ�.! ");
						Enemey.display();
						Enemey.grap();
						System.out.println("�� ���ݿ� ���� ���� �������� �޽��ϴ�.! ");
						enemyHp -= 15;
						ult += 20;

					}
				} else if (enemyUlt >= 100) {
					System.out.println("��밡 �ʻ�⸦ �����մϴ�!!!");
					enemyUlt = 0;
					userHp -= 30;
				}
				
			} else if(user.equals("2")) {          //��� �ൿ ���ý�
				System.out.println("�� �����ϼ̽��ϴ�.");
				cpu = ran.nextInt(3)+1;
				Character.display();
				Character.def();
				
				if (enemyUlt < 100) {
					if (cpu == 1) {
						System.out.println("���� ������ �����߽��ϴ�! ");
						Enemey.display();
						Enemey.atk();
						dmg = ran.nextInt(10) + 1;
						enemyHp -= dmg;
						System.out.println("����ؼ� �������� ���� �ʽ��ϴ�. ���ÿ� ����� ������ �¹޾�Ĩ�ϴ�.");
						System.out.println("��밡 " + dmg + "�� �������� �Խ��ϴ�.");
						ult += 20;

					} else if (cpu == 2) {
						System.out.println("���� �� �����߽��ϴ�! ");
						Enemey.display();
						Enemey.def();
						System.out.println("���� ��� ���� �ƹ��� �������� ���� �ʽ��ϴ�.");
					} else if (cpu == 3) {
						System.out.println("���� ��⸦ �����߽��ϴ�.! ");
						Enemey.display();
						Enemey.grap();
						System.out.println("����� ��⿡ ���� �������� �޽��ϴ�!!!");
						enemyDmg = 15;
						userHp -= enemyDmg;
						enemyUlt += 20;

					}
				} else if (enemyUlt >= 100) {
					System.out.println("��밡 �ʻ�⸦ �����մϴ�!!!");
					enemyUlt = 0;
					userHp -= 30;
				}
				
			} else if(user.equals("3")) {          //��� �ൿ ���ý�
				System.out.println("��⸦ �����ϼ̽��ϴ�.");
				cpu = ran.nextInt(3)+1;
				Character.display();
				Character.grap();
				
				if (enemyUlt < 100) {
					if (cpu == 1) {
						System.out.println("���� ������ �����߽��ϴ�.");
						Enemey.display();
						Enemey.atk();
						System.out.println("����� ���ݿ� ���� �������� �޽��ϴ�!");
						userHp -= 15;
						enemyUlt += 20;

					} else if (cpu == 2) {
						System.out.println("���� ����� �����߽��ϴ�.");
						Enemey.display();
						Enemey.def();
						System.out.println("�� ��⿡ ��밡 ���� �������� �޽��ϴ�!!!");
						enemyHp -= 15;
						ult += 20;

					} else if (cpu == 3) {
						System.out.println("��뵵 ��⸦ �����߽��ϴ�.");
						Enemey.display();
						Enemey.grap();
						System.out.println("���� ����� �޾��ļ� ��ȿȭ�˴ϴ�. �ƹ��� �������� ���� �ʽ��ϴ�.");

					}
				} else if (enemyUlt >= 100) {
					System.out.println("��밡 �ʻ�⸦ �����մϴ�!!!");
					enemyUlt = 0;
					userHp -= 30;
				}
				
			} else if(user.equals("4") && ult >=100) {   //�ʻ�� �ൿ ���ý�
				Character.display();
				System.out.println("�ʻ�� ����!!! �ſ� ���� 30�� ������!!!");
				ult = 0;
				enemyHp -= 30;
			}

			if(enemyHp < 0) {
				enemyHp = 0;
			}
			System.out.println("�� ü��["+userHp+"] ��� ü��["+enemyHp+"] "
					+ "���� �г������["+ult+"] ����� �г������["+enemyUlt+"]" );
			
		}
		

	}

}

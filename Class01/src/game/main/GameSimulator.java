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
		
		Character Character = new Shark("상어");
		Character Enemey = new Lion("사자");
		String me = Character.getAnimal();
		String e = Enemey.getAnimal();
		
		System.out.println("격투 시작합니다!");
		System.out.println("당신은 ["+me+"] 상대는 ["+e+"]입니다.");
	
		
		String user = "";
		while(true) {
			if(enemyHp <= 0 && userHp >0){               
				System.out.println("당신이 승리했습니다!!!");
				break;
			}
			else if(enemyHp > 0 && userHp <= 0){
				System.out.println("상대가 승리했습니다...");
				break;
			}
			else if (enemyHp <= 0 && userHp <= 0) {
				System.out.println("양측 모두 체력이 없습니다. 무승부!!!");
				break;
			}
			
			
			
			if(ult >= 100) {
				System.out.println("원하는 행동 번호를 입력하세요.");
				System.out.println("[1:공격] [2:방어] [3:잡기] [4:필살기]");
			} else {
				System.out.println("원하는 행동 번호를 입력하세요.");
				System.out.println("[1:공격] [2:방어] [3:잡기]");
			}
			user = s.nextLine();
			
			
			if(user.equals("1")) {               //공격 행동 선택시
				System.out.println("공격을 선택하셨습니다.");
				cpu = ran.nextInt(3)+1;
				Character.display();
				Character.atk();
				
				if (enemyUlt < 100) {
					
					
					if (cpu == 1) {
						System.out.println("상대도 공격을 선택했습니다! ");
						System.out.println("서로 공격을 주고 받습니다! ");
						dmg = ran.nextInt(10) + 1;
					
						userHp -= dmg;
						enemyHp -= dmg;
						if (dmg < 8) {
							ult += 20;
						}
						Enemey.display();
						Enemey.atk();
						System.out.println("양쪽 모두 "+dmg+"의 데미지를 받습니다.");

					} else if (cpu == 2) {
						System.out.println("상대는 방어를 선택했습니다! ");
						Enemey.display();
						Enemey.def();
						enemyDmg = ran.nextInt(10) + 1;
						System.out.println("내 공격을 상대가 방어했습니다! 상대가 오히려 맞받아쳤습니다. ");
						System.out.println("당신이" + enemyDmg + "의 데미지를 받습니다.");
						userHp -= enemyDmg;
						enemyUlt +=20;
					} else if (cpu == 3) {
						System.out.println("상대는 잡기를 시전했습니다.! ");
						Enemey.display();
						Enemey.grap();
						System.out.println("내 공격에 상대는 강한 데미지를 받습니다.! ");
						enemyHp -= 15;
						ult += 20;

					}
				} else if (enemyUlt >= 100) {
					System.out.println("상대가 필살기를 시전합니다!!!");
					enemyUlt = 0;
					userHp -= 30;
				}
				
			} else if(user.equals("2")) {          //방어 행동 선택시
				System.out.println("방어를 선택하셨습니다.");
				cpu = ran.nextInt(3)+1;
				Character.display();
				Character.def();
				
				if (enemyUlt < 100) {
					if (cpu == 1) {
						System.out.println("상대는 공격을 선택했습니다! ");
						Enemey.display();
						Enemey.atk();
						dmg = ran.nextInt(10) + 1;
						enemyHp -= dmg;
						System.out.println("방어해서 데미지를 입지 않습니다. 동시에 상대의 공격을 맞받아칩니다.");
						System.out.println("상대가 " + dmg + "의 데미지를 입습니다.");
						ult += 20;

					} else if (cpu == 2) {
						System.out.println("상대는 방어를 선택했습니다! ");
						Enemey.display();
						Enemey.def();
						System.out.println("양측 모두 방어로 아무도 데미지를 입지 않습니다.");
					} else if (cpu == 3) {
						System.out.println("상대는 잡기를 시전했습니다.! ");
						Enemey.display();
						Enemey.grap();
						System.out.println("상대의 잡기에 강한 데미지를 받습니다!!!");
						enemyDmg = 15;
						userHp -= enemyDmg;
						enemyUlt += 20;

					}
				} else if (enemyUlt >= 100) {
					System.out.println("상대가 필살기를 시전합니다!!!");
					enemyUlt = 0;
					userHp -= 30;
				}
				
			} else if(user.equals("3")) {          //잡기 행동 선택시
				System.out.println("잡기를 선택하셨습니다.");
				cpu = ran.nextInt(3)+1;
				Character.display();
				Character.grap();
				
				if (enemyUlt < 100) {
					if (cpu == 1) {
						System.out.println("상대는 공격을 선택했습니다.");
						Enemey.display();
						Enemey.atk();
						System.out.println("상대의 공격에 강한 데미지를 받습니다!");
						userHp -= 15;
						enemyUlt += 20;

					} else if (cpu == 2) {
						System.out.println("상대는 방어을 선택했습니다.");
						Enemey.display();
						Enemey.def();
						System.out.println("내 잡기에 상대가 강한 데미지를 받습니다!!!");
						enemyHp -= 15;
						ult += 20;

					} else if (cpu == 3) {
						System.out.println("상대도 잡기를 선택했습니다.");
						Enemey.display();
						Enemey.grap();
						System.out.println("서로 기술을 받아쳐서 무효화됩니다. 아무도 데미지를 입지 않습니다.");

					}
				} else if (enemyUlt >= 100) {
					System.out.println("상대가 필살기를 시전합니다!!!");
					enemyUlt = 0;
					userHp -= 30;
				}
				
			} else if(user.equals("4") && ult >=100) {   //필살기 행동 선택시
				Character.display();
				System.out.println("필살기 시전!!! 매우 강한 30의 데미지!!!");
				ult = 0;
				enemyHp -= 30;
			}

			if(enemyHp < 0) {
				enemyHp = 0;
			}
			System.out.println("내 체력["+userHp+"] 상대 체력["+enemyHp+"] "
					+ "현재 분노게이지["+ult+"] 상대의 분노게이지["+enemyUlt+"]" );
			
		}
		

	}

}

package 윷놀이;

import java.util.*;

public class Play {

	static Player[] person;
	
	static void selectPlayerNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("플레이어 수 정하기:");
		int x= scan.nextInt();
		person=new Player[x+1];
		for(int i=1;i<x+1;i++) {
			person[i]=new Player();
			person[i].playerNum=i;
		}
		scan.close();
	}
	static void selectHorseNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("말의수  정하기:");
		int x= scan.nextInt();
		for(int i=1;i<person.length+1;i++) {
			person[i].horse=new Horse[x+1];
			for(int j=1;j<x+1;j++) {
				person[i].horse[j]=new Horse();
				person[i].horse[j].playerNum=i;  //말객체의 playerNum에 플레이어 숫자를 할당;
				person[i].horse[j].horseNum=j;
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		
		selectPlayerNumber();
		selectHorseNumber();
		String x=null;
		while(true) {
			for(int i=1;i<person.length+1;i++) {
				person[i].throwYut(); //i번째 플레이어 윷 던짐
				person[i].choiceHorseToMove();
				
			}
			if(x.equals("exit")) break;
		}
	}

}

package 윷놀이;

import java.util.*;

public class Play {
	static int[][] board=new int[42][6];
	static Player[] person;
	/*
	static void selectPlayerNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("플레이어 수 정하기:");
		int x= scan.nextInt();
		person=new Player[x+1];
		for(int i=1;i<person.length;i++) {
			person[i]= new Player();
			person[i].playerNum=i;
		}
		scan.close()
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
	*/
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("플레이어 수 정하기:");
		int x= scan.nextInt();
		person=new Player[x+1];
		for(int i=1;i<person.length;i++) {
			person[i]= new Player();
			person[i].playerNum=i;
		}
		System.out.println("말의수  정하기:");
		int x1= scan.nextInt();
		for(int i=1;i<person.length;i++) {
			person[i].horse=new Horse[x1+1];
			for(int j=1;j<x1+1;j++) {
				person[i].horse[j]=new Horse();
				person[i].horse[j].playerNum=i;  //말객체의 playerNum에 플레이어 숫자를 할당;
				person[i].horse[j].horseNum=j;
			}
		}
		//selectPlayerNumber();
		//selectHorseNumber();
		boolean play=true;
		while(play) {
			for(int i=1;i<person.length;i++) {
				System.out.println(i+"번째 플레이의 턴");
				person[i].throwYut(); //i번째 플레이어 윷 던짐
				if(person[i].zeroBackDo) continue;  // 백도가 나왔는데 모든 말이 출발을 안했다면 바로 다음 사람이 진행.
				int tmp=person[i].choiceHorseToMove();
				if(person[i].score==person[i].horse.length) {  //해당 플레이어의 말이 다 통과했다면 게임 종류
					play=false;
					break;
				}
				if(person[i].horse[tmp].checkGrasp) {     //잡은 말이 있다면
					System.out.print(person[i].horse[tmp].gtmp[0]+"번 플레이어의 ");
					for(int j=1;j<6;j++) {                //해당 말객채가 저장하고 있는 잡은 플레이어의 말들의 포지션을 0로 만든다.
						if(person[i].horse[tmp].gtmp[j]!=0) {
							System.out.print(person[i].horse[tmp].gtmp[j]+" ");
							person[person[i].horse[tmp].gtmp[0]].horse[j].position=0;
						}
					}
					System.out.println("말을 잡았습니다. 한번더");
					i--;	
					continue; // 잡았으니 해당 플레이어는 한번 더 던진다.
				}

			}
		}
	}
}

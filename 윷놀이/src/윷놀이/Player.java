package 윷놀이;

import java.util.*;
public class Player {
	int playerNum;
	int score=0; //통과한 말의 수
	Horse[] horse; //총 말의 수
	int moveNum;
	boolean zeroBackDo=false;
	Scanner scan=new Scanner(System.in);
	/*
	void selectHorseNum() {    //게임 시작 전 말의 갯수 정하기
		System.out.print("말의 개수 정하기: ");
		int x=scan.nextInt();
		horse=new Horse[x];
		for(int i=0;i<x;i++) {
			horse[i].horseNum=(int)Math.pow(2,i);
		}
	}
	*/
	void choiceNumber() {
		System.out.print("-1:백도 / 1:도 / 2:개 / 3:걸/ 4:윷/ 5:모>>");
		moveNum=scan.nextInt();
		int count=1;
		int i;
		if(moveNum==-1) {                       //말들이 전부다 출발안했는데 백도가 나온다면, zeroBack를 true로
			for(i=1;i<horse.length;i++) {
				if(horse[i].position==0)
					count++;
			}
			if(count==i)
				zeroBackDo=true;
		}
		else zeroBackDo=false;
	}
	
	
	void throwYut() { //윳던지기
		System.out.println(playerNum+"번 플레이어가 윷을 던집니다.");
		moveNum=Yut.getNumber();
		int count=1;
		int i;
		if(moveNum==-1) {                       //말들이 전부다 출발안했는데 백도가 나온다면, zeroBack를 true로
			for(i=1;i<horse.length;i++) {
				if(horse[i].position==0)
					count++;
			}
			if(count==i)
				zeroBackDo=true;
		}
		else zeroBackDo=false;
	}
	
	int choiceHorseToMove() {    //움직일 말 선택해서 움직이기
		
		System.out.print("움질일 말을 선택하세요.1~"+(horse.length-1)+">");
		int x=scan.nextInt();
		horse[x].move(moveNum);
		if(horse[x].goalIn) {
			if(horse[x].override) {
				for(int i=1;i<6;i++) {
					if(horse[x].atmp[i]==i) {
						score++;
					}
				}
			}
			score++; 
		}
		else {
		
		System.out.print(horse[x].horseNum);
		if(horse[x].override) {
			for(int i=1;i<6;i++) {
				if(horse[x].atmp[i]==i) {
					System.out.print(" "+i);
				}
		    }
		}
		System.out.println("말의 현재 위치는"+horse[x].position);
		
		}
		return x;
	}
	
}

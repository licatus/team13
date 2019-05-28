package 윷놀이;

import java.util.*;
public class Player {
	int playerNum;
	int score=0; //통과한 말의 수
	String sc = "";
	Horse[] horse; //총 말의 수
	int moveNum;
	boolean zeroBackDo=false;
	boolean yutmo = false;
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
	void choiceNumber(int num) {
		moveNum = num;
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
		if(moveNum==4 ||moveNum==5 ) {
			yutmo=true;
		}
		else yutmo=false;
	}
	
	
	int throwYut() { //윳던지기
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
		if(moveNum==4 ||moveNum==5 ) {
			yutmo=true;
		}
		else yutmo=false;
		return moveNum;
	}
	
	int choiceHorseToMove(int num) {    //움직일 말 선택해서 움직이기
		
		int x= num;
		horse[x].move(moveNum);
		if(horse[x].goalIn) {
			if(horse[x].override) {
				for(int i=1;i<6;i++) {
					if(horse[x].atmp[i]==i) {
						score++;
						sc = sc + i;
						
					}
				}
			}
			score++; 
			sc = sc + x;
		}
		else {
		
		if(horse[x].override) {
			for(int i=1;i<6;i++) {
				if(horse[x].atmp[i]==i) {
				}
		    }
		}
		}
		return x;
	}
	
}

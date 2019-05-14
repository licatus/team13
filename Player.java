package 윷놀이;
import java.util.*;
public class Player {
	int playerNum;
	int score=0; //통과한 말의 수
	Horse[] horse; //총 말의 수
	int moveNum;
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
	void throwYut() { //윳던지기
		moveNum=Yut.getNumber();
	}
	
	void choiceHorseToMove() {    //움직일 말 선택해서 움직이기 
		int x=scan.nextInt();
		horse[x].move(moveNum);
	}
}

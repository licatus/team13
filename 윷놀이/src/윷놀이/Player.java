package ������;

import java.util.*;
public class Player {
	int playerNum;
	int score=0; //����� ���� ��
	String sc = "";
	Horse[] horse; //�� ���� ��
	int moveNum;
	boolean zeroBackDo=false;
	boolean yutmo = false;
	Scanner scan=new Scanner(System.in);
	/*
	void selectHorseNum() {    //���� ���� �� ���� ���� ���ϱ�
		System.out.print("���� ���� ���ϱ�: ");
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
		if(moveNum==-1) {                       //������ ���δ� ��߾��ߴµ� �鵵�� ���´ٸ�, zeroBack�� true��
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
	
	
	int throwYut() { //��������
		moveNum=Yut.getNumber();
		int count=1;
		int i;
		if(moveNum==-1) {                       //������ ���δ� ��߾��ߴµ� �鵵�� ���´ٸ�, zeroBack�� true��
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
	
	int choiceHorseToMove(int num) {    //������ �� �����ؼ� �����̱�
		
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

package ������;

import java.util.*;
public class Player {
	int playerNum;
	int score=0; //����� ���� ��
	Horse[] horse; //�� ���� ��
	int moveNum;
	boolean zeroBackDo=false;
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
	void choiceNumber() {
		System.out.print("-1:�鵵 / 1:�� / 2:�� / 3:��/ 4:��/ 5:��>>");
		moveNum=scan.nextInt();
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
	}
	
	
	void throwYut() { //��������
		System.out.println(playerNum+"�� �÷��̾ ���� �����ϴ�.");
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
	}
	
	int choiceHorseToMove() {    //������ �� �����ؼ� �����̱�
		
		System.out.print("������ ���� �����ϼ���.1~"+(horse.length-1)+">");
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
		System.out.println("���� ���� ��ġ��"+horse[x].position);
		
		}
		return x;
	}
	
}

package ������;
import java.util.*;
public class Player {
	int playerNum;
	int score=0; //����� ���� ��
	Horse[] horse; //�� ���� ��
	int moveNum;
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
	void throwYut() { //��������
		moveNum=Yut.getNumber();
	}
	
	void choiceHorseToMove() {    //������ �� �����ؼ� �����̱� 
		int x=scan.nextInt();
		horse[x].move(moveNum);
	}
}

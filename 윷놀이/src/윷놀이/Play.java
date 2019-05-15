package ������;

import java.util.*;

public class Play {
	static int[][] board=new int[42][6];
	static Player[] person;
	/*
	static void selectPlayerNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�÷��̾� �� ���ϱ�:");
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
		System.out.println("���Ǽ�  ���ϱ�:");
		int x= scan.nextInt();
		for(int i=1;i<person.length+1;i++) {
			person[i].horse=new Horse[x+1];
			for(int j=1;j<x+1;j++) {
				person[i].horse[j]=new Horse();
				person[i].horse[j].playerNum=i;  //����ü�� playerNum�� �÷��̾� ���ڸ� �Ҵ�;
				person[i].horse[j].horseNum=j;
			}
		}
		scan.close();
	}
	*/
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("�÷��̾� �� ���ϱ�:");
		int x= scan.nextInt();
		person=new Player[x+1];
		for(int i=1;i<person.length;i++) {
			person[i]= new Player();
			person[i].playerNum=i;
		}
		System.out.println("���Ǽ�  ���ϱ�:");
		int x1= scan.nextInt();
		for(int i=1;i<person.length;i++) {
			person[i].horse=new Horse[x1+1];
			for(int j=1;j<x1+1;j++) {
				person[i].horse[j]=new Horse();
				person[i].horse[j].playerNum=i;  //����ü�� playerNum�� �÷��̾� ���ڸ� �Ҵ�;
				person[i].horse[j].horseNum=j;
			}
		}
		//selectPlayerNumber();
		//selectHorseNumber();
		boolean play=true;
		while(play) {
			for(int i=1;i<person.length;i++) {
				System.out.println(i+"��° �÷����� ��");
				person[i].throwYut(); //i��° �÷��̾� �� ����
				if(person[i].zeroBackDo) continue;  // �鵵�� ���Դµ� ��� ���� ����� ���ߴٸ� �ٷ� ���� ����� ����.
				int tmp=person[i].choiceHorseToMove();
				if(person[i].score==person[i].horse.length) {  //�ش� �÷��̾��� ���� �� ����ߴٸ� ���� ����
					play=false;
					break;
				}
				if(person[i].horse[tmp].checkGrasp) {     //���� ���� �ִٸ�
					System.out.print(person[i].horse[tmp].gtmp[0]+"�� �÷��̾��� ");
					for(int j=1;j<6;j++) {                //�ش� ����ä�� �����ϰ� �ִ� ���� �÷��̾��� ������ �������� 0�� �����.
						if(person[i].horse[tmp].gtmp[j]!=0) {
							System.out.print(person[i].horse[tmp].gtmp[j]+" ");
							person[person[i].horse[tmp].gtmp[0]].horse[j].position=0;
						}
					}
					System.out.println("���� ��ҽ��ϴ�. �ѹ���");
					i--;	
					continue; // ������� �ش� �÷��̾�� �ѹ� �� ������.
				}

			}
		}
	}
}

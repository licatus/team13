package ������;

public class Play {
	static int[][] board=new int[42][6];
	static Player[] person;
	static int x = 0;
	static int x1 = 0;
	static GUI frame1 = new GUI();
	static GUI2 frame2 = new GUI2();
	static GUI3 frame3 = new GUI3();
	public static void main(String[] args) {
		
		frame2.setVisible(true);
		while(GUI2.z == 0)
		{
			System.out.print("");
		}
		GUI2.pause();
		
		frame1.setVisible(true);
		x = GUI2.x;
		x1 = GUI2.y;
		

		person=new Player[x+1];
		for(int i=1;i<person.length;i++) {
			person[i]= new Player();
			person[i].playerNum=i;
		}

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
				frame1.setlogf(i + "�� - �� ������");
				int k = frame1.staystate();
				
				if(k==2) { 
					int j = frame3.selYut();
					person[i].choiceNumber(j);
					frame1.setlogy(j);
				}
				else if(k==1){
					int l = person[i].throwYut();
					frame1.setlogy(l);
					
					//i��° �÷��̾� �� ����
				}
				if(person[i].zeroBackDo) continue;  // �鵵�� ���Դµ� ��� ���� ����� ���ߴٸ� �ٷ� ���� ����� ����.
				frame1.setlogf(i + "�� - �� ����");
				int sh = frame1.stayhorse();
				frame1.remove(person[i].horse[sh].position);
				int tmp=person[i].choiceHorseToMove(sh);
				frame1.refresh(i, person[i].horse[sh].position, person[i].horse[sh].setstr());
				frame1.setscore(i , person[i].sc);
				if(person[i].score==(person[i].horse.length-1)) {  //�ش� �÷��̾��� ���� �� ����ߴٸ� ���� ����
					play=false;
					break;
				}
				if(person[i].horse[tmp].checkGrasp) {     //���� ���� �ִٸ�
					System.out.print(person[i].horse[tmp].gtmp[0]+"�� �÷��̾��� ");
					for(int j=1;j<6;j++) {               //�ش� ����ä�� �����ϰ� �ִ� ���� �÷��̾��� ������ �������� 0�� �����.
						if(person[i].horse[tmp].gtmp[j]!=0) {
							System.out.print(person[i].horse[tmp].gtmp[j]+" ");
							person[person[i].horse[tmp].gtmp[0]].horse[j].position=0;
						}
					}
					frame1.setlogy("���� ��ҽ��ϴ�. �ѹ���");
					i--;	
					continue; // ������� �ش� �÷��̾�� �ѹ� �� ������.
				}
				if(person[i].yutmo) {     // ���̳� �� ������ �ѹ��� ������.
					frame1.setlogy("�ѹ���");
					i--;	
					continue; // ������� �ش� �÷��̾�� �ѹ� �� ������.
				}

			}
		}
	}
}

package ������;

public class Horse {
	int playerNum;//�÷��̾� ��ȣ
	int horseNum; //�� ��ȣ
	int position=0; // ���� ��ġ
	boolean override=false; //�����ִ��� ����
	boolean checkGrasp=false; //�������µ� �����.
	boolean goalIn=false;
	int[] atmp=new int[6];  //�����ִ� �� ����
	int[] gtmp=new int[6]; //���� �� ����
	void move(int x) {	

		/*
		int i;                      //���� �����ǿ� �ش� �÷��̾��� �ٸ� ���� ������ tmp�� �ش� ����ȣ�� ������. 
		for(i=1;i<6;i++) {
			if(board[position][i].playerNum==playerNum)
				atmp[i]=i;
		}
		itmp=position;
		board[position]=null;//���� �������� �����.
		*/
		if(position!=0) {    	
		board.board[position][0]=0;         //������ ���� ����ġ�� �÷��̾ ������ �ǹ�. 
		board.board[position][horseNum]=0;  //������ ���� ����ġ�� �ش� ����ȣ�� 0���� 
		checkOverriding();   //�����ִ� ���� �ִ����� äũ
		}
		
		if(position==5 && x!=-1) {     
			position=25+x;
		}
		if(position==10 && x!=-1) {
			position=35+x;
		}
		if(position==28 && x!=-1) {
			position=38+x;
		}
		
		position=position+x;
		
		if(position>30&&position<36) {
			position=position-30+14;
		}
		if((position>20&&position<26)||position>41) {
			position=100; // ������ �ǹ�
			goalIn=true;
		}
		
		if(board.board[position][0]!=playerNum&&board.board[position][0]!=0) {
			grasp(); // �̵��� ��ġ�� �ٸ� �÷��̾��� ���� �ִ� ��� ��� �Լ� ȣ��
		}
		else { 
			checkGrasp=false;
			 for(int i=1;i<6;i++) {
						gtmp[i]=0; 
		     }
		}
		if(override==true) {
			overriding(); // ���� ���� �ִ� ���  
		}
		if(goalIn==true) {
			return;
		}
		
		board.board[position][0]=playerNum;       //board�� ù��° �ε����� ���� �ش� �÷��̾� ��ȣ �ֱ�
		board.board[position][horseNum]=horseNum;  //�ش� �� ��ȣ�� board�� �ش� �����ǿ� �´� �ε����� ��ȣ �ֱ�.
		
	}
	
	void checkOverriding() {   
		for(int i=1;i<6;i++) {   // �ش� �������� �ٸ� �迭�� �ش��ϴ� ����ȣ�� �����Ѵٸ� ��������. true�� �ٲ���. 
			if(board.board[position][i]==i) {
				atmp[i]=i;   //�迭�� �����ִ� ������ ��ȣ�� ����.
				override=true;
			}
			else atmp[i]=0;
		}
		if(override!=true) {    //true�� �ƴ϶�� ������ false�� �ٲ���.
			override=false;
		}
	}
	 void grasp() {
		 checkGrasp=true;
		 gtmp[0]=board.board[position][0];
		 for(int i=1;i<6;i++) {
				if(board.board[position][i]==i) { 
					gtmp[i]=i; 
					board.board[position][i]=0;
				}
				else gtmp[i]=0;
		 	}
		}
	 void overriding() {
			for(int i=1;i<6;i++) {
				if(atmp[i]==i) {
					board.board[position][i]=i;
				}
				else board.board[position][i]=0;
			}
		}
}



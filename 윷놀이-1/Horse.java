package 윷놀이;

public class Horse {
	int playerNum;
	int horseNum; 
	int position=0; 
	boolean override=false; 
	boolean checkGrasp=false; 
	boolean goalIn=false;
	int[] atmp=new int[6];  
	int[] gtmp=new int[6]; 
	String str = "";
	void move(int x) {	
		if(position!=0) {    	
		board.board[position][0]=0;          
		board.board[position][horseNum]=0;
		checkOverriding();
		}
		
		
		if(position==5 && x!=-1) {     
			position=25+x;
		}
		else if(position==10 && x!=-1) {
			position=35+x;
		}
		else if(position==28 && x!=-1) {
			position=38+x;
		}
		else position=position+x;
		
		if(position==38)    
			position=28;
		
		if(position>30&&position<36) {
			
			position=position-30+14;
		}
		if((position>21&&position<26)||position>42) {
			goalIn=true;
		}
		
		if(board.board[position][0]!=playerNum&&board.board[position][0]!=0) {
			grasp(); 
		}
		else { 
			checkGrasp=false;
			 for(int i=1;i<6;i++) {
						gtmp[i]=0; 
		     }
			 
		}
		if(override==true) {
			overriding(); 
		}
		if(goalIn==true) {
			System.out.print("����!!");
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
			else {
				atmp[i] = 0;
			}
			board.board[position][i] = 0;
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
				board.board[position][i]=0;
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



package 윷놀이;

public class Horse {
	int playerNum;//플레이어 번호
	int horseNum; //말 번호
	int position=0; // 현재 위치
	boolean override=false; //업혀있는지 상태
	boolean checkGrasp=false; //움직였는데 잡았음.
	boolean goalIn=false;
	int[] atmp=new int[6];  //업혀있는 말 정보
	int[] gtmp=new int[6]; //잡힌 말 정보
	String str = "";
	void move(int x) {	
		if(position!=0) {    	
		board.board[position][0]=0;         //보드의 현재 말위치의 플레이어가 없음을 의미. 
		board.board[position][horseNum]=0;  //보드의 현재 말위치의 해당 말번호를 0으로 
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
		
		if(position==38)    // 38포지션과 28포지션은 보드판에서 겹치는 부분. 
			position=28;
		
		if(position>30&&position<36) {
			
			position=position-30+14;
		}
		if((position>21&&position<26)||position>42) {
			goalIn=true;
		}
		
		if(board.board[position][0]!=playerNum&&board.board[position][0]!=0) {
			grasp(); // 이동한 위치에 다른 플레이어의 말이 있는 경우 잡기 함수 호출
		}
		else { 
			checkGrasp=false;
			 for(int i=1;i<6;i++) {
						gtmp[i]=0; 
		     }
		}
		checkOverriding();
		if(override==true) {
			overriding(); // 말이 업혀 있는 경우  
		}
		if(goalIn==true) {
			System.out.print("골인!!");
			return;
		}
		
		board.board[position][0]=playerNum;       //board의 첫번째 인덱스의 말의 해당 플레이어 번호 넣기
		board.board[position][horseNum]=horseNum;  //해당 말 번호를 board의 해당 포지션에 맞는 인덱스에 번호 넣기.
		
	}
	
	void checkOverriding() {   
		for(int i=1;i<6;i++) {   // 해당 포지션의 다른 배열에 해당하는 말번호가 존재한다면 엎혀있음. true로 바꿔줌. 
			if(board.board[position][i]==i) {
				atmp[i]=i;   //배열에 엎혀있는 말들의 번호를 저장.
				override=true;
			}
			else atmp[i]=0;
		}
		if(override!=true) {    //true가 아니라면 여전히 false로 바꿔줌.
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
	 String setstr() {
		 str = Integer.toString(horseNum);
		 for(int q = 1; q<6; q++) {
			 if(q == atmp[q])
			 {
				 str = str + Integer.toString(atmp[q]);
			 }
		 }

		 return str;
	 }
}



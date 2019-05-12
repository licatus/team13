package 윷놀이;

public class Horse {
	static Horse[][] board=new Horse[41][6];  //말이 놓여있는 보드판. [position][0] : 플레이어 번호 ,[position][1,2,3,4,5] : 말번호
	int playerNum;//플레이어 번호
	int horseNum; //말 번호
	int position=0; // 현재 위치
	int[] atmp=new int[6];
	int itmp;
	void move(int x) {	
		
		int i;                      //이전 포지션에 해당 플레이어의 다른 말이 있으면 tmp에 해당 말번호를 저장함. 
		for(i=1;i<6;i++) {
			if(board[position][i].playerNum==playerNum)
				atmp[i]=i;
		}
		itmp=position;
		board[position]=null;//이전 포지션을 비워둠.
		
		if(itmp==5 && x!=-1) {     
			position=25+x;
		}
		if(itmp==10 && x!=-1) {
			position=35+x;
		}
		if(itmp==28 && x!=-1) {
			position=38+x;
		}
		position=itmp+x;
		
		if(itmp>30&&itmp<36) {
			position=itmp-30+14;
		}
		if((position>=20&&position<26)||position>40) {
			position=100; // 골인을 의미
		}
		
		if(board[position][0].playerNum!=playerNum) {   //만약 해당 position에 다른 말이 있는 경우 다른 말 잡기	
			grasp();
		}
		if(board[position][0].playerNum==playerNum) {   //해당 position에 같은 말이 있는 경우 업기
			
		}
	}
	void grasp() {    //보드 내용을 어떻게 다뤄야 할지를 모르겠어요ㅜㅜ
		for(int i=0;i<6;i++) {
		 board[position][i].position=0;   //해당 포지션에 있던 모든 말객체의 포지션을 0으로 만듬.
		}
		board[position][0].playerNum=playerNum;
		for(int i=1;i<6;i++) {
			if(atmp[i]!=0) {
				board[position][i].horseNum=i;
				board[position][i].playerNum=playerNum;
			}
		}
	}
}
 
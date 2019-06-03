package 윷놀이;

public class Play {
	static Player[] person;
	static int p = 0;
	static int h = 0;
	static SetGameGui frame2 = new SetGameGui();
	static YutGui frame3 = new YutGui();
	static String str = null;
	static String ssr = null;
	public static void main(String[] args) {
		String ssr = null;
		
		frame2.setVisible(true);
		while(SetGameGui.z == 0)
		{
			System.out.print("");
		}
		SetGameGui.pause();
		p = SetGameGui.getp;
		h= SetGameGui.geth;
		BoardGui frame1 = new BoardGui(p, h);
		frame1.setVisible(true);

		person=new Player[p+1];
		for(int i=1;i<person.length;i++) {
			person[i]= new Player();
			person[i].playerNum=i;
		}

		for(int i=1;i<person.length;i++) {
			person[i].horse=new Horse[h+1];
			for(int j=1;j<h+1;j++) {
				person[i].horse[j]=new Horse();
				person[i].horse[j].playerNum=i;  //말객체의 playerNum에 플레이어 숫자를 할당;
				person[i].horse[j].horseNum=j;
			}
		}
		//selectPlayerNumber();
		//selectHorseNumber();
		boolean play=true;
		while(play) {
			for(int i=1;i<person.length;i++) {
				frame1.setlogf(i + "번 - 윷 던지기");
				int k = frame1.staystate();
				
				if(k==2) { 
					int j = frame3.selYut();
					person[i].choiceNumber(j);
					frame1.setlogy(j);
				}
				else if(k==1){
					int l = person[i].throwYut();
					frame1.setlogy(l);
					
					//i번째 플레이어 윷 던짐
				}
				if(person[i].zeroBackDo) continue;  // 백도가 나왔는데 모든 말이 출발을 안했다면 바로 다음 사람이 진행.
				frame1.setlogf(i + "번 - 말 선택");
				int sh = frame1.stayhorse();
				frame1.remove(person[i].horse[sh].position);
				int tmp=person[i].choiceHorseToMove(sh);
				if(person[i].horse[tmp].override) {
		               for(int j=1;j<6;j++) {
		                  if(person[i].horse[tmp].atmp[j]!=0) {
		                     person[i].horse[j].position=person[i].horse[tmp].position;
		                  }
		               }
		            }
			
				
				frame1.refresh(i, person[i].horse[sh].position, setstr(person[i].horse[sh].position));

				frame1.setscore(i, person[i].score);
			
				if(person[i].score==(person[i].horse.length-1)) {  
					play=false;
					WinnerGui frame4 = new WinnerGui(i);
					frame4.setVisible(true);
					break;
				}
				if(person[i].horse[tmp].checkGrasp) {     //잡은 말이 있다면
					System.out.print(person[i].horse[tmp].gtmp[0]+"번 플레이어의 ");
					for(int j=1;j<6;j++) {               //해당 말객채가 저장하고 있는 잡은 플레이어의 말들의 포지션을 0로 만든다.
						if(person[i].horse[tmp].gtmp[j]!=0) {
							System.out.print(person[i].horse[tmp].gtmp[j]+" ");
							person[person[i].horse[tmp].gtmp[0]].horse[j].position=0;
						}
					}
					frame1.setlogy("말을 잡았습니다. 한번더");
					i--;	
					continue; // 잡았으니 해당 플레이어는 한번 더 던진다.
				}
				if(person[i].yutmo) {     // 윷이나 모가 나오면 한번더 던저기.
					frame1.setlogy("한번더");
					i--;	
					continue; // 잡았으니 해당 플레이어는 한번 더 던진다.
				}
			}
		}
	}	

static String setstr(int pos) {
	str = "";
		 for(int q = 1; q<6; q++) {
			 if(q == board.board[pos][q])
			 {
				 str = str + Integer.toString(board.board[pos][q]);
			 }
		 }

		 return str;
	
}
}

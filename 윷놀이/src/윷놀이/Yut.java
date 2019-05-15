package 윷놀이;
import java.util.*;
public class Yut {

	static int number=0; 
	static int getNumber() {
		number=0;
		while(number==0) {
		number=(int)(Math.random()*7)-1;  // -1:백도 / 1:도 / 2:개 / 3:걸/ 4:윷/ 5:모
		}
		switch (number) {
		case -1 : System.out.println("백도가 나왔습니다.");
			break;
		case 1 : System.out.println("도가 나왔습니다.");
			break;
		case 2 : System.out.println("개가 나왔습니다.");
			break;
		case 3 : System.out.println("걸이 나왔습니다.");
			break;
		case 4 : System.out.println("윷이 나왔습니다.");
			break;
		case 5 : System.out.println("모가 나왔습니다.");
			break;
		}
		return number;
	}
}

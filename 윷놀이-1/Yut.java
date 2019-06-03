package 윷놀이;
import java.util.*;
public class Yut {
	
	static int number=0; 
	static int getNumber() {
		number=0;
		while(number==0) {
		number=(int)(Math.random()*7)-1;  //
		}
		return number;
	}
}

package ������;
import java.util.*;
public class Yut {
	
	static int number=0; 
	static int getNumber() {
		number=0;
		while(number==0) {
		number=(int)(Math.random()*7)-1;  // -1:�鵵 / 1:�� / 2:�� / 3:��/ 4:��/ 5:��
		}
		return number;
	}
}

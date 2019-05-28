package À·³îÀÌ;
import java.util.*;
public class Yut {
	
	static int number=0; 
	static int getNumber() {
		number=0;
		while(number==0) {
		number=(int)(Math.random()*7)-1;  // -1:¹éµµ / 1:µµ / 2:°³ / 3:°É/ 4:À·/ 5:¸ğ
		}
		return number;
	}
}

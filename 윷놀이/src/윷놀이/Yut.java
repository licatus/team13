package ������;
import java.util.*;
public class Yut {

	static int number=0; 
	static int getNumber() {
		number=0;
		while(number==0) {
		number=(int)(Math.random()*7)-1;  // -1:�鵵 / 1:�� / 2:�� / 3:��/ 4:��/ 5:��
		}
		switch (number) {
		case -1 : System.out.println("�鵵�� ���Խ��ϴ�.");
			break;
		case 1 : System.out.println("���� ���Խ��ϴ�.");
			break;
		case 2 : System.out.println("���� ���Խ��ϴ�.");
			break;
		case 3 : System.out.println("���� ���Խ��ϴ�.");
			break;
		case 4 : System.out.println("���� ���Խ��ϴ�.");
			break;
		case 5 : System.out.println("�� ���Խ��ϴ�.");
			break;
		}
		return number;
	}
}

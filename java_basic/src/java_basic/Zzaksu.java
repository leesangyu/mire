package java_basic;

import java.util.Scanner;

public class Zzaksu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		int putNum = 0;
		char juge = ' ';
		
		System.out.println("���� �ϳ��� �Է��Ͻÿ�. : ");
		putNum = scann.nextInt();
		
		
		if (putNum % 2 == 0){juge = '¦';} 
		else {juge = 'Ȧ'; } 
		
		
		System.out.println("�Է��� ���� "+ putNum +"�� " + juge + " �Դϴ�.");
	
		
		
		
		
	}

}

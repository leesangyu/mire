package java_basic;

import java.util.Scanner;

public class Zzaksu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		int putNum = 0;
		char juge = ' ';
		
		System.out.println("정수 하나를 입력하시오. : ");
		putNum = scann.nextInt();
		
		
		if (putNum % 2 == 0){juge = '짝';} 
		else {juge = '홀'; } 
		
		
		System.out.println("입력한 정수 "+ putNum +"는 " + juge + " 입니다.");
	
		
		
		
		
	}

}

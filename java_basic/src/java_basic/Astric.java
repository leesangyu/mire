package java_basic;

import java.util.Scanner;

public class Astric {

	public static void main(String[] args) {
		/*
		입력한 정수만큼 '*' 을 찍는 프로그램을 작성하시오.
	
		실행)
		정수입력 : 5
		*****
		
		실행)
		정수입력 : 10
		**********
*/	
		//선언
		Scanner scann = new Scanner(System.in);
		int inputNum = 0;
		String result = "";

		//입력
		System.out.print("정수입력 : ");
		inputNum = scann.nextInt();
		
		//처리
		for (int i = 0;i<inputNum;i++) {
			result += "*";
		}
		
		//출력
		System.out.println(result);
		

	}

}

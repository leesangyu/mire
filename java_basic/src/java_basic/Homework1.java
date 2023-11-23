package java_basic;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		int putNum = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		System.out.println("숫자를 입력하세요. :");
		putNum = scann.nextInt();

		num1 = putNum/1000;
	
		num2 = putNum/100 - putNum/1000*10;

		num3 = putNum/10 - putNum/100*10;
	
		num4 = putNum - putNum/10*10;
		
		System.out.println("첫번째 숫자는 : ");
		System.out.println(num1);
		System.out.println("두번째 숫자는 : ");
		System.out.println(num2);
		System.out.println("세번째 숫자는 : ");
		System.out.println(num3);
		System.out.println("네번째 숫자는 : ");
		System.out.println(num4);
	}

}

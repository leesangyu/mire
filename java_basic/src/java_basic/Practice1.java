package java_basic;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		
		int putNum = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		float a = 0f;
		
		System.out.println("���ڸ� �Է��ϼ���. : ");
		putNum = scann.nextInt();
		
		a = putNum / 10000f;

		num1 = (int)(a * 10);
		a = a *10 - num1;
		num2 = (int)(a*10);
		a = a *10 - num2;
		num3 = (int)(a*10);
		a = a *10 - num3;
		num4 = (int)(a*10);
		
		System.out.println("ù��° ���� : ");
		System.out.println(num1);
		System.out.println("�ι�° ���� : ");
		System.out.println(num2);
		System.out.println("����° ���� : ");
		System.out.println(num3);
		System.out.println("�׹�° ���� : ");
		System.out.println(num4);
	}

}

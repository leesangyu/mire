package java_basic;

import java.util.Scanner;

public class Astric {

	public static void main(String[] args) {
		/*
		�Է��� ������ŭ '*' �� ��� ���α׷��� �ۼ��Ͻÿ�.
	
		����)
		�����Է� : 5
		*****
		
		����)
		�����Է� : 10
		**********
*/	
		//����
		Scanner scann = new Scanner(System.in);
		int inputNum = 0;
		String result = "";

		//�Է�
		System.out.print("�����Է� : ");
		inputNum = scann.nextInt();
		
		//ó��
		for (int i = 0;i<inputNum;i++) {
			result += "*";
		}
		
		//���
		System.out.println(result);
		

	}

}

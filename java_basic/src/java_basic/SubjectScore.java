package java_basic;

import java.util.Scanner;

public class SubjectScore {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		int scien=0;
		
		int total=0;
		float evg=0f;
		char grade = 'F'; //�ʱ�ȭ�� ������ ��������
		
		System.out.print("���� ���� : ");
		kor = scann.nextInt();
		
		System.out.print("���� ���� : ");
		eng = scann.nextInt();
		
		System.out.print("���� ���� : ");
		math = scann.nextInt();
		
		System.out.print("���� ���� : ");
		scien = scann.nextInt();
		
		
		total = kor + eng + math + scien;
		evg = total/4f;
		evg = (int)((evg*100+5)/10)/10f;
		
		if (evg < 60) {grade = 'F';}
		if (evg >= 60) {grade = 'D';}
		if (evg >= 70) {grade = 'C';}
		if (evg >= 80) {grade = 'B';}
		if (evg >= 90) {grade = 'A';}
//		if (evg >= 90){grade = 'A';}
//		if ((evg >= 80) && (evg <= 90)){grade = 'B';}
//		if ((evg >= 70) && (evg <= 80)){grade = 'C';}
//		if ((evg >= 60) && (evg <= 70)){grade = 'D';}
//		if (evg < 60) {grade = 'F';}
		
		System.out.println("����\t����\t����\t����\t����\t���\t\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f\t%c",kor,eng,math,scien,total,evg,grade);
	}

}

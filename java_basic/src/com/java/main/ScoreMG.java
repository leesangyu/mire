package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�л����� �Է¹ް� �� �л� �� ��ŭ ����, ����, ����, ���� ������ �Է¹޾� 
		//������ ���� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
		
		final int STUDEN_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("�л� �� :");
		STUDEN_NUM = scann.nextInt(); scann.nextLine();
		
		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];
		
		//�Է�
		for(int i=0; i<STUDEN_NUM;i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}
		
		//���
		
		System.out.print("����\t");
		ScoreVO.printLabel();
		for(int i=0; i<STUDEN_NUM;i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
//		for(int i =0; i<STUDEN_NUM;i++) {
//			scores[i] = new ScoreVO();
//			
//			System.out.print("�̸� : ");
//			scores[i].name = scann.nextLine();
//			
//			System.out.print("���� : ");
//			scores[i].kor = scann.nextInt();scann.nextLine();
//			
//			System.out.print("���� : ");
//			scores[i].eng = scann.nextInt();scann.nextLine();
//			
//			System.out.print("���� : ");
//			scores[i].math = scann.nextInt();scann.nextLine();
//			
//			System.out.print("���� : ");
//			scores[i].scien = scann.nextInt();scann.nextLine();
//		}
//		System.out.println("����\t�̸�\t����\t����\t����\t����\t����\t���");
//		for(int i=0; i<STUDEN_NUM;i++) {
//			System.out.println((i+1)+"\t"+scores.name
//									+"\t"+scores.kor
//									+"\t"+scores.eng
//									+"\t"+scores.math
//									+"\t"+scores.scien
//									+"\t"+scores.total()
//									+"\t"+scores.evg());}
			
	}
//	public void printLabel() {
//		System.out.println("����\t�̸�\t����\t����\t����\t����\t����\t���");
//	}
//	public void printScore() {
//		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien+"\t"+total()+"\t"+evg());
//		
//	}


}

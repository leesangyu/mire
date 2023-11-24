package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생수를 입력받고 그 학생 수 만큼 국어, 수학, 영어, 과학 점수를 입력받아 
		//총점과 평군을 나타내는 프로그램을 작성하시오.
		
		final int STUDEN_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("학생 수 :");
		STUDEN_NUM = scann.nextInt(); scann.nextLine();
		
		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];
		
		//입력
		for(int i=0; i<STUDEN_NUM;i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}
		
		//출력
		
		System.out.print("순번\t");
		ScoreVO.printLabel();
		for(int i=0; i<STUDEN_NUM;i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
//		for(int i =0; i<STUDEN_NUM;i++) {
//			scores[i] = new ScoreVO();
//			
//			System.out.print("이름 : ");
//			scores[i].name = scann.nextLine();
//			
//			System.out.print("국어 : ");
//			scores[i].kor = scann.nextInt();scann.nextLine();
//			
//			System.out.print("영어 : ");
//			scores[i].eng = scann.nextInt();scann.nextLine();
//			
//			System.out.print("수학 : ");
//			scores[i].math = scann.nextInt();scann.nextLine();
//			
//			System.out.print("과학 : ");
//			scores[i].scien = scann.nextInt();scann.nextLine();
//		}
//		System.out.println("순번\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
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
//		System.out.println("순번\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
//	}
//	public void printScore() {
//		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien+"\t"+total()+"\t"+evg());
//		
//	}


}

package com.java.main;

import com.java.dto.ScoreVO;



public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreVO s = new ScoreVO();
		
		s.kor = 98;
		s.math = 90;
		s.eng = 87;
		s.scien = 78;
		
		System.out.println("ÃÑÁ¡ : "+s.total());
		System.out.println("Æò±Õ : "+s.evg());
	

	
	}
}

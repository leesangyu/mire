package java_basic;

import java.util.Scanner;

public class Judgment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		int putNum = 0;
		String result = "";
	
		
		System.out.println("정수를 입력하시오. ");
		putNum = scann.nextInt();
		
		boolean condition = putNum % 2 !=0
				&& putNum % 3 != 0
				&& putNum % 5 != 0;
		if(condition) { result = "2, 3, 5의 배수가 아닙니다. ";}
		else { 
			if (putNum % 2 == 0) {result = result + "2";
				if(putNum % 3 == 0) { result = result + ", 3";
					if(putNum % 5 ==0) {result = result + ", 5의 배수입니다.";}
						else{result = result + "배수입니다.";}}}
					
			
				else {
					
				}
			}
			if (putNum % 3 == 0) {result = result + "3, ";}
			if (putNum % 5 == 0) {result = result + "5 ";}
			result = result + "의 배수입니다.";
		}
        System.out.println(result);
			}
}
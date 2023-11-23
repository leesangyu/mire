package java_basic;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String menu = "";

		while(!menu.toUpperCase().equals("Q")) {
			System.out.println("1.회원가입 2.회원조회 3.회원수정 4.회원삭제");
			System.out.println("메뉴를 선택하세요.(종료 : Q)");
	
			Scanner scann = new Scanner(System.in);
			menu = scann.nextLine();
	
			
			switch (menu) {
			case "1":
				System.out.println("회원가입.......");
				break;
			case "2":
				System.out.println("회원수정.......");
				break;
			case "3":
				System.out.println("회원삭제.......");
				break;
			case "q":
			case "Q":
				System.out.println("프로그램을 종료합니다.");
				break;
			case "4":
				break;
			default: 
				System.out.println("메뉴선택이 올바르지 않습니다.");
				;
				}
		}
	}

}

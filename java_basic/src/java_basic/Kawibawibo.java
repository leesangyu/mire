package java_basic;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		String com_kwb = ""; // 가위 0, 바위 1, 보 2
		int com_kwb_num = 0;

		String my_kwb = ""; // 가위 0, 바위 1, 보 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";
		
		String quit = "";
		
		while(!quit.toUpperCase().equals("Q")) {

		// 입력
		com_kwb_num = (int) Math.random() * 3;

		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");

		Scanner scann = new Scanner(System.in);
		while(true) {
			menu = scann.nextInt();scann.nextLine();
		
			if (menu < 1 || menu >3) {
				System.out.println("입력이 올바르지 않습니다. ");
			}else {
				break;
			}
		}
		my_kwb_num = menu - 1;
//		
//		'나머지 정리'를 활용한 계산
//		입력값에 1을 더하고 3으로 나누면 값이 같아진다.
//		
//		컴퓨터	1 2 0 1 2 0 1 2 0 1 2 0 1
//		=================================
//		입력값	0 1 2 0 1 2 0 1 2 0 1 2 0
//		↓	↓	↓  (입력값 +1)	↓	↓	↓
//		입력값	1 2 3 1 2 3 1 2 3 1 2 3 1
//		↓	↓	↓  (입력값 %3)	↓	↓	↓
//		입력값	1 2 0 1 2 0 1 2 0 1 2 0 1
//		=================================
//		컴퓨터	1 2 0 1 2 0 1 2 0 1 2 0 1
//		입력값	1 2 0 1 2 0 1 2 0 1 2 0 1
//		
//		이렇게 값을 동일하게 만든 후 동일 한 값일 경우
//		컴퓨터가 이겼다 판단할 수 있게 된다.
//		
//		이를통해 아래와 같은 연산순서로 승패를 판단할 수 있다.
//		
//		1. 같은가? -> 졌습니다.
//		2. 최초값이 같은가? -> 비겼습니다
//		3. 최초값이 다른가? -> 이겼습니다.
//				
//		순서로 가위바위보 승패를 판단할 수 있다.
//		
		if (com_kwb_num == (my_kwb_num + 1) % 3) {
			juge = "졌습니다.";
		} else {
			if (com_kwb_num == my_kwb_num) {
				juge = "비겼습니다.";
			} else {
				juge = "이겼습니다.";
			}
		}
//		
//		else if 문의 활용
//		반복되는 else 문과 if 문을 합쳐서
//		조건문 작성을 단순화 한다.
//		
		if (my_kwb_num == 0) {
			my_kwb = "가위";
		} else if (my_kwb_num == 1) {
			my_kwb = "바위";
		} else {
			my_kwb = "보";
		}

		if (com_kwb_num == 0) {
			com_kwb = "가위";
		} else if (com_kwb_num == 1) {
			com_kwb = "바위";
		} else {
			com_kwb = "보";
		}

		// 출력
		System.out.println("컴퓨터 : " + com_kwb);
		System.out.println("당신 : " + my_kwb);
		System.out.println(juge);
		
		System.out.println("더 할거에요?(그만:q)");
		System.out.println("계속하려면 아무키나 누르세요");
		quit = scann.nextLine();
		}
		
	}
}
package java_basic;

public class Sotsu {

	public static void main(String[] args) {
		//변수선언
		Scanner scann = new Scanner(System.in);
		int temp = 0;
		boolean isSotsu = true;
		
		//입력문
		System.out.print("정수 입력 : ");
		temp = scann.nextInt();
			
		//계산식
		for(int i=2;i<temp;i++) {
			if (temp%i == 0) {
				isSotsu = false;
			}
		}
		
		//출력문
		if (isSotsu) {
			System.out.println("솟수 입니다.");
		} else {
			System.out.println("솟수가 아닙니다.");
		}
		
		
		
		

	}

}

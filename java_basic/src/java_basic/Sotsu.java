package java_basic;

public class Sotsu {

	public static void main(String[] args) {
		//��������
		Scanner scann = new Scanner(System.in);
		int temp = 0;
		boolean isSotsu = true;
		
		//�Է¹�
		System.out.print("���� �Է� : ");
		temp = scann.nextInt();
			
		//����
		for(int i=2;i<temp;i++) {
			if (temp%i == 0) {
				isSotsu = false;
			}
		}
		
		//��¹�
		if (isSotsu) {
			System.out.println("�ڼ� �Դϴ�.");
		} else {
			System.out.println("�ڼ��� �ƴմϴ�.");
		}
		
		
		
		

	}

}

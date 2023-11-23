package java_basic;

public class Switch {

	public static void main(String[] args) {
		int inputInt = 0;

//		switch �� jdk ������ ����
//		jdk 1.6 ���Ͽ����� ������, jdk 1.7 �̻󿡼��� ���ڿ� �񱳰� ��������

//		���� if ���� ������� ������ switch �Լ��� ����ȭ �� ���ִ�.
//		if (inputInt%2 == 0) {
//			System.out.println("¦���Դϴ�.");
//		} else {
//			System.out.println("Ȧ���Դϴ�.");
//		}

		inputInt = 988;
//		����� ���� ��Ȯ�� �� ����ϴ� switch �Լ� �̴�.
//		�� ����ġ �Լ��� or ���·� ����ȴ�.
//		�׷��� ������ �Ʒ� �ڵ带 �����ϸ� ������ ���� ��µȴ�.
//		��� : ¦���Դϴ�.
//		��� : Ȧ���Դϴ�.
		switch (inputInt % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
		case 1:
			System.out.println("Ȧ���Դϴ�.");
		}
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		inputInt = 988;
//		���� ���� ������ ���� ���� brack ���� ����Ѵ�.
		switch (inputInt % 2) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		}
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		inputInt = 988;
//		���� �̷��� switch ���� Ư���� Ȱ���Ͽ� or ������ �� ���ִ�.
//		�������� ���� default ���� case �̿��� ������ ���Ѵ�.
		switch (inputInt % 7) {
		case 0:
		case 1:
			System.out.println("�������� 0 �Ǵ� 1 �Դϴ�.");
			break;
		case 2:
		case 3:
			System.out.println("�������� 2 �Ǵ� 3 �Դϴ�.");
			break;
		case 4:
			System.out.println("�������� 4 �Դϴ�.");
			break;
		default:
			System.out.println("�������� 5 �Ǵ� 6 �Դϴ�.");
		}
	}
}

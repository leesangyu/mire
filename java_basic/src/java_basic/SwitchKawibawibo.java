package java_basic;

import java.util.Scanner;

public class SwitchKawibawibo {

	public static void main(String[] args) {
		
//		Switch���� Ȱ���� if �� �ۼ�
		String com_kwb = ""; // ���� 0, ���� 1, �� 2
		int com_kwb_num = 0;

		String my_kwb = ""; // ���� 0, ���� 1, �� 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		// �Է�
		com_kwb_num = (int) Math.random() * 3;

		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");

		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		my_kwb_num = menu - 1;

		if (com_kwb_num == (my_kwb_num + 1) % 3) {
			juge = "�����ϴ�.";
		} else if (com_kwb_num == my_kwb_num) {
			juge = "�����ϴ�.";
		} else {
			juge = "�̰���ϴ�.";
		}

		switch (my_kwb_num) {
		case 0:
			my_kwb = "����";
			break;
		case 1:
			my_kwb = "����";
			break;
		default:
			my_kwb = "��";
		}

		switch (com_kwb_num) {
		case 0:
			com_kwb = "����";
			break;
		case 1:
			com_kwb = "����";
			break;
		default:
			com_kwb = "��";
		}

		// ���
		System.out.println("��ǻ�� : " + com_kwb);
		System.out.println("��� : " + my_kwb);
		System.out.println(juge);
	}
}
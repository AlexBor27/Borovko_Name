package name;

import java.util.Scanner;

/***************************************************************
 * ��������� ��������: ���� ��������� ��� ��������� � ��������,*
 * �� ������� "������, ��������", ���� ���, �� ������� "���    *
 * ������ �����"											   *
 **************************************************************/

public class Name {

	private static String name = "��������";

	public static void func(String s) {

		if (s.length() != 0) {
			if (name.equals(s)) {
				System.out.print("������, ��������");
			} else {
				System.out.print("��� ������ �����");
			}
		} else {
			System.out.println("�� �� ����� ������");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������� ��� � ������� 'Enter' ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		func(str);
		scan.close();
		
	}

}

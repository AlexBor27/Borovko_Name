package name;

import java.util.Scanner;

/***************************************************************
 * Составить алгоритм: если введенное имя совпажает с Вячеслав,*
 * то вывести "Привет, Вячеслав", если нет, то вывести "Нет    *
 * такого имени"					       *
 **************************************************************/

public class Name {

	private static String name = "Вячеслав";

	public static void func(String s) {

		if (s.length() != 0) {
			if (name.equals(s)) {
				System.out.print("Привет, Вячеслав");
			} else {
				System.out.print("Нет такого имени");
			}
		} else {
			System.out.println("Вы не ввели данных");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Введите имя и нажмите 'Enter' ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		func(str);
		scan.close();
		
	}

}

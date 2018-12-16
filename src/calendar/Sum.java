package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a, b;
		
		//입력: 키보드로 두 수의 입력을 받는다. 
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(s1 + "와 " + s2 + "의 합은 " + (a + b) + "입니다.");
		
		scanner.close();
	}

}

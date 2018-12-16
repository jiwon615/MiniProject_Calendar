package calendar;

import java.util.Scanner;


public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {   //정수로 달을 입력받아 해당 달의 최대 일수를 반환
		return MAX_DAYS[month - 1];  //인덱스는 0부터 시작하므로 1을 빼줘야 함 
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar(); //클래스에 대한 객체 생성 
		
		System.out.println("반복 횟수를 입력하세요.");
		int repeat = scanner.nextInt();
		
		for (int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();  //입력받는 달은 정수형 
			System.out.println(month + "월은 " + cal.getMaxDaysOfMonth(month) + "일까지 있습니다.");  //클래스의 함수 사용하므로 cal.getMaxDaysOfMonth(month)
		}
		
		System.out.println("Bye~");	
		scanner.close();


	}

}

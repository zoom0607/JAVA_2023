package s0410;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int day;
		int month = sc.nextInt();
		switch (month) {
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;

		default:
			day = 31;
			break;
		}
		System.out.printf("%d월은 %d일입니다.",month,day);
	}

}

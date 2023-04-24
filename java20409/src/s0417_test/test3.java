package s0417_test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, day;
		System.out.print("달 입력 : ");
		month = sc.nextInt();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
		default:
			day = 31;
			break;
		}
		System.out.printf("%d월은 %d일입니다.",month,day);

	}

}

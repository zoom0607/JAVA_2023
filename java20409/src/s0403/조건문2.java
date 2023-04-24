package s0403;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		//입력)
		//수입력 : 7
		//출력
		//7은 3의 배수가 아니다.
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
		switch (a % 3) {
		case 0:
			System.out.println(a+"은(는) 3의 배수입니다.");
			break;

		default:
			System.out.println(a+"은(는) 3의 배수가 아닙니다");
			break;
		}
	}

}

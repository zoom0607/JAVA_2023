package s0327;

import java.util.Scanner;

public class 연산자1 {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}

	}

}

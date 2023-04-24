package s0410;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// 다음은 숫자를 입력받아 1부터 num가지에 대하여 다음곽ㅌ은 출력 결과가 나오도록 하는프로그램이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			
			if(i % 2 == 1) {
				sum += i;
				System.out.print(" + "+i);
			}
			else {
				sum -= i;
				System.out.print(" - "+i);
			}
			
			
			
		}
		System.out.print(" = "+sum);
		
		
	}

}

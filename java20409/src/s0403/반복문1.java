package s0403;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		//예제 26
		//어떤수 N을 입력받아 1~N가지의 계산을 한다.
		//단, 짝수는 -, 홀수는 +
		int N;
		int sum = 0;
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		N = sc.nextInt();
		
		//반복문 
		for(int i = 1; i <= N; i++)
			if(i % 2 == 0) {
				sum -= i;
				System.out.print(" -"+i);
			}else {
				sum += i;
				System.out.print(" +"+i);
			}
		System.out.println("");
		System.out.println("sum = "+sum);

	}

}
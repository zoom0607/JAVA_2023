package s0403;

import java.util.Scanner;

public class 라스트테스트 {

	public static void main(String[] args) {
		int N;
		int i =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 숫자나 입력하세요 : ");
		N = sc.nextInt();
		
		while(true) {
			System.out.println(i);

			i++;
			if(i % 3 == 0) {
				
				continue;
				
			}
			if(i == N) {
				System.out.println(i+"끝");
				break;
			}
			
			
			
			
			
		}

	}

}

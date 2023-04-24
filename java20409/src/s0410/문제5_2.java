package s0410;

import java.util.Scanner;

public class 문제5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=num) {
			if(i % 2 == 1) {
				sum += i;
				System.out.print(" + "+i);
			}
			else {
				sum -= i;
				System.out.print(" - "+i);
			}
			i++;
			
			
			
			
			
		}
		System.out.print(" = "+sum);
		
	}

}

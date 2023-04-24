package s0417_test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int i = 0,max = 0;
		System.out.println("정수 5개를 입력해주세요");
		while(i < 5) {
			System.out.printf("%d번째 정수 : ",i+1);
			num[i] = sc.nextInt();
			if(num[i] > max) {
				max = num[i];
			}
			i++;
		}
		System.out.printf("입력한 값들 중 최대값은 %d입니다.",max);
		
		
		
		
	}

}

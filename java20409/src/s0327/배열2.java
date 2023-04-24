package s0327;

import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		int score[] = new int[5];
		int sum = 0;
		double avg;
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		//합
		for(int i = 0; i < score.length; i++) {
			System.out.print("성적입력 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		//평균
		avg = (double)sum / score.length ;
		
		//출력
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f",avg);
	}

}
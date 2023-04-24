package s0417_test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[][] score = new int[2][3];
		int sum = 0;
		double avg ;
		
		for(int i = 0; i < 2; i++) {
			System.out.printf("학생 %d 이름 입력 : ",i+1);
			name[i] = sc.next();
			for(int j = 0; j < 3; j++) {
				System.out.printf("성적 %d 입력 : ",j+1);
				score[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("*********입력 완료**********");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				sum += score[i][j];
			}
			avg = sum/3.0;
			System.out.printf(name[i]+"학생의 총점은 "+sum+"점 이고, 평균은 %.2lf점 입니다.",avg);
		}
		
	}

}

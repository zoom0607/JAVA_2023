package s0410;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[2];
		int [][]score = new int[2][3];
		int sum = 0;
		double avg = 0;
		
		
		for(int i = 0; i < 2; i++) {
		System.out.printf("학생 %d 이름 입력 : ",(i+1));
		name[i] = sc.next();
		for(int j = 0 ; j < 3; j++  ) {
			System.out.printf("성적 %d 입력 : ",(j+1));
			score[i][j] = sc.nextInt();
			
			
			
		}
		
		}
		System.out.println("----- 입력 완료 -----");
		for(int i = 0; i < 2; i++) {
			sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += score[i][j];
				
				
				
			}
			
			avg  = 0;
			avg = sum / 3.0;
			System.out.printf("%s 학생의 총점은 %d이고, 평균은 %.2f이다\n",name[i],sum,avg);
			if(avg>=90)
				System.out.println(name[i]+"학생의 등급은 A입니다.");
			else if(avg>=80)
				System.out.println(name[i]+"학생의 등급은 B입니다.");
			else if(avg>=70)
				System.out.println(name[i]+"학생의 등급은 C입니다.");
			else if(avg>=60)
				System.out.println(name[i]+"학생의 등급은 D입니다.");
			else
				System.out.println(name[i]+"학생의 등급은 F입니다.");
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
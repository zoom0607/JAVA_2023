package s0313;

import java.util.Scanner;

public class 입출력1 {

	public static void main(String[] args) {
		
		System.out.println("20409 성연우");
		//System.out.println("나는 "안녕"하고 말햇다.");
		System.out.println("나는 \"안녕\"하고 말햇다.");
		
		Scanner s = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = s.nextInt();
		System.out.println("내 나이는 "+ age +"세");
	}

}

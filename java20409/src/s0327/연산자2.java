package s0327;

import java.util.Scanner;

public class 연산자2 {

	public static void main(String[] args) {
		int a, b;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자a를 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("숫자b를 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		c = sc.next().charAt(0);
		
		if(c == '+')
			System.out.println(a+"+"+b+"="+a+b);
		else if (c == '-')
			System.out.printf(a+"-"+b+"="+(a-b));
		else if (c == '*')
			System.out.println(a+"*"+b+"="+a*b);
		else if (c == '/')
			System.out.println(a+"/"+b+"="+a/b);
		else
			System.out.println("사칙연산자가 아닙니다.");
	}

}

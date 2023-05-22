package s0522;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(5.0);
		c1.printIf();
		
		Circle c2 = new Circle(8.0);
		c2.printIf();
		
		//반지름을 입력받아서 원의 둘레와 넓이를 구하세요
		double r;
		System.out.print("반지름 : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		Circle c3 = new Circle();
		c3.setRadius(r);
		c3.printIf();
		


	}

}

package s0522;

public class Circle {
	private double radius;//반지름
	private final static double PI = 3.14; 
	
	//생성자
	Circle(){}
	Circle(double radius){
		this.radius = radius;
	}
	
	double getRadius () {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	double computeArea() {
		return (radius * radius * PI);
	}
	
	double computePerimeter() {
		return (radius * 2 * PI);
	}
	
	void printIf() {
		System.out.println("넓이 : "+computeArea());
		System.out.println("둘레 : "+computePerimeter());
	}
	
	
	
	
	
	
}
	


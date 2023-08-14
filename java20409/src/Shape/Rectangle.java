package Shape;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
	
	private int width, height;
	
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
		
		
	}
	
	public void draw() {
		super.draw();
		System.out.println("가로 "+width+", 세로"+height+"인 사각형으로 그립니다.");
		
	}
	
	public void calculateArea() {
		super.calculateArea();
		System.out.println("가로 "+width+", 세로"+height+"인 사각형의 넓이는 "+(width*height)+"입니다.");
	}
	public void calculateRound() {
		super.calculateRound();
		System.out.println("가로 "+width+", 세로"+height+"인 사각형의 둘레는 "+(width*2+height*2)+"입니다.");
	}
	
	
	

}

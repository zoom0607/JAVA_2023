package s0612;
//부모
public class Car {
	String carname;
	String color;
	private int velocity;
	
	void speedUp() {
		velocity +=5;
	}
	
	void speedDown() {
		velocity -=5;
	}
}

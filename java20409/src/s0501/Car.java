package s0501;

public class Car {
	//속성--------------------------------------------------------------------------------------------------------------------------
	String owner ; //소유자
	String color ;
	int speed ;//속도
	int km ; //주행거리
	static int count;
	
	//생성자(생략가능)----------------------------------------------------------------------------------------------------------
	Car(){
		count++;
		System.out.println("총 차의 대수 :"+count);
	}
	Car(String name, String col,int speed){
		owner = name;
		color = col;
		this.speed = speed;
		count++;
		System.out.println("총 차의 대수 :"+count);

	}
	
	
	//메소드 : 주행거리를 10씩 올린다.
	void run() {
		km = km + 10;
		
	}
	//주행 속도를 0으로 바꾸고 
	//현재까지의 주행거리를 출력한다.
	void stop() {
		speed = 0;
		System.out.println(owner+"의 차는 "+km+"km를 달렸습니다.");
	}
	
	void speedUP() {//속도를 5씩 올린다.
		speed += 5;
		System.out.println(owner+"의 차의 현재속도는 "+speed+"km/h입니다.");
		km +=2;
		System.out.println(owner+"의 차의 현재 이동거리는 "+km+"km입니다.");

		
		
	}
	
	void speepDown() {
		speed -= 5;
		System.out.println(owner+"의 차의 현재속도는 "+speed+"km/h입니다.");
	}
	
	void printCarInfo() {
		System.out.println("소유자 : "+owner);
		System.out.println("색상 : "+color);
		System.out.println("현재속도 : "+speed);
		System.out.println("주행거리 : "+km);
		
	}
	
	
}

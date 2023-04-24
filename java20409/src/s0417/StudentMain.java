package s0417;

public class StudentMain {

	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		Student lee = new Student("이지은", 20 , 2, 789, 48);
		
		hong.age = 10;
		hong.grade = 6;
		hong.name = "홍길동";
		hong.number = 25;
		hong.printName();
		hong.printAll();
		
		kim.age = 18;
		kim.grade = 2;
		kim.name = "김민준";
		kim.number = 5;
		kim.eat();
		kim.printName();
		kim.printAll();
		
		lee.printAll();

	}

}

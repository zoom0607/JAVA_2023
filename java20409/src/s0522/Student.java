package s0522;

public class Student {
	private String name = "noname";
	private int grade=0;
	private float score;
	
	static int count = 0;
	static String SchoolName = "로봇고";
	final static float PI = 3.141592f;
	Student(){//생성자 : 공통으로 작업할 내용
		count++; //생성할때마다 학생수를 증가시키려는 목적
	}
	
	Student(String name, int grade ){
		this();
		this.name = name;
		this.grade = grade;
		
	}
	//이름을 저장
	void setName(String n) {
		name = n;
	}
	//이름을 리턴
	String getName(){
		return name;
	}
	//학년을 저장
	void setGrade(int i) {
		grade = i;
	}
	//학년을 리턴
	int getGrade() {
		return grade;
	}
	
	//학년을 저장
	void setScore(float a) {
			score = a;
		}
	//학년을 리턴
	float getScore() {
			return score;
		}
	
	void printAll() {
		System.out.println("이름 :"+getName());
		System.out.println("학년 : "+getGrade());
		System.out.println("성적 : "+getScore());
		
	}
	
	
	
	void print() {
		System.out.println(count +"번째 학생 이름은"+getName()+"이고 "+getGrade()+"학년이다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

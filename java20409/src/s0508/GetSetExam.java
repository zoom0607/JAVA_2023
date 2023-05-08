package s0508;

public class GetSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 클래스의 name , grade를 추정한다
		
		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("김민준");
		System.out.println(kim.getName());
		System.out.println(kim.getGrade());
		kim.setGrade(1);
		System.out.println(kim.getGrade());
		System.out.println(kim.getName()+"는 "+kim.getGrade()+"학년 입니다.");
		
		System.out.println(kim.getScore());
		kim.setScore(3.14f);
		System.out.println(kim.getScore());
		
		Student sung = new Student();
		sung.setName("성연우");
		sung.setGrade(2);
		sung.setScore(1000);
		sung.printAll();
		
	}

}

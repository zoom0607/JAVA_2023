package s0619_2;

public class Student extends Person{
	
	boolean online;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		if(online == true)
			System.out.println(name+"학생이며 현재 온라인 수업 중 입니다.");
		else
			System.out.println(name+"학생이며 현재 등교 수업 중 입니다.");

	}
	

}

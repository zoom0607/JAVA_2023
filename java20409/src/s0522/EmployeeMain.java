package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setName("성연우");
		e1.setAge(18);
		e1.setNo(20409);
		System.out.println(e1.toString());
		
		Employee e2 = new Employee("김민준",20405,18);
		System.out.println(e2.toString());
		
	}

}

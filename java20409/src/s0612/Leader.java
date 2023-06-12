package s0612;

public class Leader extends Student {
	boolean lead;
	
	public Leader(boolean lead) {
		this.lead = lead;
	}
	
	Leader(String name, String hakbun,boolean lead){
		super(name,hakbun);
		this.lead = lead;
	}

	//메소드 
	void isLeader(){
		if (lead == true)
			System.out.println(name + " 학급회장");
		else
			System.out.println(name +" 학급회장 아니다.");
	}
	
}

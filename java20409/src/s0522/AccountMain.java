package s0522;

public class AccountMain {

	public static void main(String[] args) {
		//계좌 생성
		Account Sung = new Account();
		Sung.setName("성연우");
		Sung.setNo(20409);
		Sung.setBalance(100000000);
		Sung.printInfo();
		
		Account Kim = new Account("김민준",20405);
		Kim.printInfo();
		Kim.deposit(100000);
		Kim.withdraw(20000);
		Kim.printInfo();
		
		Account Shin = new Account("신경화",20400,1234567890);
		Shin.withdraw(90000);
		Shin.printInfo();
	}

}

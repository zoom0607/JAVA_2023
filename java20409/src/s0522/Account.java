package s0522;

public class Account {
	private String name;
	private int no;
	private int balance;
	
	Account(){}
	Account(String name, int no){
		this.name = name;
		this.no = no;
	}
	Account(String name, int no, int balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	String getName() {return name;}
	int getNo() {return no;}
	int getBalance() {return balance;}
	
	void setName(String name) {this.name = name;}
	void setNo(int no) {this.no = no;}
	void setBalance(int balance) {this.balance = balance;}
	
	void printInfo() {
		System.out.println("[계좌정보] 이름 : "+name+" 계좌번호 : "+no+" 현재잔고 : "+balance+"원");
	}
	
	void deposit(int money) {
		System.out.println(name+"님 "+money+"원 입금\n현재잔액 : "+balance);
		balance += money;
		
	}
	void withdraw(int money) {
		if(money > balance) {
			System.out.println(name+"님 잔액이 부족하여"+money+"원 출금 실패하였습니다. 현재잔액 : "+balance);
		}
		else {
		System.out.println(name+"님 "+money+"원 출금 \n현재잔액 : "+balance);
		balance -= money;
		}
	}
	
	
	
	
	

}

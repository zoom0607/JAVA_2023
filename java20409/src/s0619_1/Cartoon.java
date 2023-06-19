package s0619_1;

public class Cartoon extends Book {
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon == true)
			System.out.println("이 만화는 웹툰");
		else
			System.out.println("이 만화는 웹툰이 아니다.");
	
	}
	
	
	
}

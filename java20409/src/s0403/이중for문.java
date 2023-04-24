package s0403;

public class 이중for문 {

	public static void main(String[] args) {
		for(int i = 1; i<=3;i+=1) {
			for(int j = 1; j <= 5;j+=1) {
				System.out.print(j+"\t");
			}
			System.out.println("\n");
			
		}
		System.out.println("------예제 28-------");
		for(int i = 1; i<=8;i+=1) {
			for(int j = 1; j <= i;j+=1) {
				System.out.print(i*j);
			}
			System.out.println("\n");
			
		}
		System.out.println("------예제 29-------");
		for(int i = 1; i<=9;i+=1) {
			for(int j = 1; j <= i;j+=1) {
				System.out.print('*');
			}
			System.out.println("\n");
			
		}
		System.out.println("------예제 30-------");
		for(int i = 10; i>=1;i-=1) {
			for(int j = 1; j <= i;j+=1) {
				System.out.print('*');
			}
			System.out.println("\n");
			
		}
	}

}

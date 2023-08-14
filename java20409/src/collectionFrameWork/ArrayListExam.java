package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("제우스");
		list.add("오너");
		list.add("페이커");
		list.add("구마유시");
		list.add("케리아");
		list.add("포비");
		System.out.println("============================================");
		//데이터 조회
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list);//저장된 데이터 한번에 출력
		System.out.println("============================================");

		
		//데이터 삭제
		System.out.println("삭제 전 신청 학생 수 "+ list.size());
		list.remove("포비");
		System.out.println("삭제 후 신청 학생 수 "+ list.size());
		System.out.println(list);//저장된 데이터 한번에 출력
		System.out.println("============================================");

		
		
		System.out.println("남은 학생 수(제외 전 )"+list.size());
		list.remove(list.size()-1);
		System.out.println("남은 학생 수(제외 gn )"+list.size());
		System.out.println("============================================");

		//순회 for()
		for(String s:list) {
			System.out.println(s);
			
		}
		
		System.out.println("============================================");

		//데이터 변경
		System.out.println("이름 변경 전 : "+list.get(0));
		list.set(0, "황우스");
		System.out.println("이름 변경 후 : "+list.get(0));
		
		
		
		
		
		
		
		
		System.out.println("============================================");
		
		//데이터 검색
		
		System.out.println(list.indexOf("페이커"));
		
		//포함 여부만 확인
		if(list.contains("페이커")) {
			System.out.println("페이커가 포함되어있습니다.");
		}
		else {
			System.out.println(("페이커가 포함되어 있지 않습니다."));
		}
		
		
		System.out.println("============================================");
		//데이터 전체 삭제
		
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("학생 수 : "+list.size());
		}
		System.out.println(list);
		System.out.println("============================================");
		//데이터 재입력 후 정렬
		
		list.add("도란");
		list.add("피넛");
		list.add("쵸비");
		list.add("페이즈");
		list.add("딜라이트");
		
		Collections.sort(list);
		
		
		for(String string: list) {
			System.out.println(string);
			
		}
		
		
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("============================================");

		
		
		
		
		
	}

}

package hanar.naver_test;

import java.util.Scanner;
// 이태경 20182645 git:hanarotg

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	// 한글을 영어로 번역하여 출력하는 메소드
	public static String kor2Eng(String word) {
		int i = 0;
		
		// kor배열에서 동일한 문자열 존재 여부  파악
		for(; i<kor.length; i++) {
			if(word.equals(kor[i]) == true) {
				break;
			}
		}
		
		// 단어가 없는 경우 CannotFineWord 문자열을 반환, 있는 경우 eng[i] 문자열 반환
		if(i == kor.length) {
			return "CannotFineWord";
		} else {
			return eng[i];
		}
		
	}
}

public class DicApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		System.out.print("한글 단어?");
		String inputWord = sc.next();
		
		// 그만을 입력할 때까지 반복
		while(inputWord.equals("그만") == false){
			
			// 같은 한글 단어가 없는 경우
			if((Dictionary.kor2Eng(inputWord))
					.equals("CannotFineWord") == true) {
				System.out.println(inputWord + "는 저의 사전에 없습니다.");
			} else { 
				// 같은 한글 단어가 있는 경우
				System.out.println(inputWord + "은 " + Dictionary.kor2Eng(inputWord));
			}
			
			System.out.print("한글 단어?");
			inputWord = sc.next();
		}
		
		sc.close();

	}

}

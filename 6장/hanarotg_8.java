package hanar.naver_test;

import java.util.Scanner;

// 20182645 이태경  git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 가능합니다.");
		inputString  = sc.nextLine(); // 빈칸 허용 문자열 저장
		
		// 빈칸 포함 문자 갯수 +1 만큼 반복한다.
		for(int i = 0; i<=inputString.length(); i++) {
			
			// i번 인덱스부터 마지막 인덱스(문자열 길이)까지 출력
			System.out.print(inputString.substring(i, inputString.length()));
			
			// i가 문자열의 처음(0)이 아닌경우 0부터 i-1번쪠  문자를 출력
			for(int j = 0; j<i; j++) {
				System.out.print(inputString.charAt(j));
			}
			
			System.out.println("");
		}
	}
}

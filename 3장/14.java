package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		// 문제에서 주어진 배열
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		
		System.out.print("과목 이름>>");
		String s = sc.next();
		
		// '그만'을 입력할 때까지 반복
		while(s.equals("그만") == false){
			// 입력한 문자열과 배열의  과목 이름을 비교한다.
			for(i = 0; i<5; i++) {
				// 입력한 문자열 s가 curse[i] 문자열과  같을 경우
				if(course[i].equals(s)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				}
			}
			
			// 없는 과목을 검색한 경우
			if(i == 5) {
				System.out.println("없는 과목입니다.");
			}
			
			System.out.print("과목 이름>>");
			s = sc.next();
		}
		
		sc.close();
	}
}

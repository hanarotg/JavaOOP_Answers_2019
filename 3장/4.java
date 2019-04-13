package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하세요>>");
		String s = sc.next();
		//string.charAt(0) : 문자열의 첫번째 문자를 반환하는 메소드
		char inputAlphabet = s.charAt(0);
		// 각 줄마다 마지막에 출력되는 문자, 첫 줄의 마지막 문자는 입력한 문자와 동일하다.
		char outputLastAlphabet = inputAlphabet;
		
		// 마자막에 출력될 문자가 a가 될 때까지 반복한다.
		for(; 97 <= outputLastAlphabet; outputLastAlphabet--) {
			// 해당 줄에 a 부터 outputLastAlphabet 까지 출력
			for(int i = 97; i<= outputLastAlphabet; i++) {
				System.out.printf("%c", i);
			}
			
			System.out.println("");
		}
		
		sc.close();
	}
}

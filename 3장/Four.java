package test;

import java.util.Scanner;
//20182605 남윤건
public class Four {
	public static void main(String[] args) {
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		String st = "abcdefghijklmnopqrstuvwxyz";
		int x = scan.next().charAt(0) - '0' - 48;//a는 1로 z는 26으로 저장
		for(int i = 0; i < x; i++) {
			System.out.println(st.substring(0,x-i));//출력
		}
		
	}
}

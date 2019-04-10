package test;

import java.util.Scanner;
//20182605 남윤건
public class Two {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scan = new Scanner(System.in);
		int x;//입력한 숫자
		x = scan.nextInt();
		if(x / 10 == x % 10) {//10의 자리와 1의 자리가 같은가?
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {//다르면
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		scan.close();
	}
}

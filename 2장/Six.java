package test;

import java.util.Scanner;
//20182605 남윤건
public class Six {
	public static void main(String[] args) {
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		int x;//입력 받을 값
		int a = 0;//3,6,9의 갯수 저장 값
		x = scan.nextInt();
		if(x / 10 == 3 || x / 10 == 6 || x / 10 == 9) {//x의 10의 자리가 3,6,9중 이라면
			a++;//3,6,9의 갯수 추가 1
		}
		if(x % 10 == 3 || x % 10 == 6 || x % 10 == 9) {//x의 1의 자리가 3,6,9중 이라면
			a++;//3,6,9의 갯수 추가 1
		}
		if(a == 1) {//3,6,9의 갯수가 1개라면
			System.out.print("박수짝");
		}
		if(a == 2) {//3,6,9의 갯수가 2개라면
			System.out.print("박수짝짝");
		}
		
		scan.close();
	}
}

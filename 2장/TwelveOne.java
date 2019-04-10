package test;

import java.util.Scanner;
import java.text.DecimalFormat;
//20182605 남윤건
public class TwelveOne {
	public static void main(String[] args) {
		float x,y;
		char symbol;
		DecimalFormat ft = new DecimalFormat("#.###");//최대 소수점 3자리까지 계산
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산>>");		
		x = scan.nextFloat();
		symbol = scan.next().charAt(0);
		y = scan.nextFloat();
		
		if(symbol == '+') {//더하기면
			System.out.print(ft.format(x) + "+" + ft.format(y) + "의 계산 결과는 " + ft.format(x+y));
		}
		else if(symbol == '-') {//빼기면
			System.out.print(ft.format(x) + "-" + ft.format(y) + "의 계산 결과는 " + ft.format(x-y));
		}
		else if(symbol == '*') {//곱하기면
			System.out.print(ft.format(x) + "*" + ft.format(y) + "의 계산 결과는 " + ft.format(x*y));
		}
		else if(symbol == '/') {//나누기면
			if(y == 0) {//만약 두 번째 피연산자가 0일시
				System.out.print("0으로 나눌 수 없습니다.");
			}
			else {//0이 아니면
				System.out.print(ft.format(x) + "/" + ft.format(y) + "의 계산 결과는 " + ft.format(x/y));
			}
		}
	}
}

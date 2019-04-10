package test;

import java.util.Scanner;
//20182605 남윤건
public class Eight {
	public static void main(String[] args) {
		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		int x1,x2,y1,y2;
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		if(x2 < 100 || y2 < 100 || x1 > 200 || y1 > 200) {//곂치지 않는다면
			System.out.print("두 직사각형은 충돌하지 않습니다.");
		}
		else {//곂친다면
			System.out.print("두 직사각형은 충돌합니다.");
		}
		
		scan.close();
	}	
}

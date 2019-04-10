package test;

import java.util.Scanner;
//20182605 남윤건
public class Ten {
	public static void main(String[] args) {
		int x1,x2,y1,y2,r1,r2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		r1 = scan.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		r2 = scan.nextInt();
		
		//두 원의 중심사이의 거리가 두 원의 반지름의 합보다 큰가?(두 원이 곂치지 않는가?)
		if(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) > r1 + r2) {
			System.out.print("두 원은 서로 곂치지 않는다.");
		}
		else {//아니면
			System.out.print("두 원은 서로 곂친다.");
		}
		
		scan.close();
	}
}

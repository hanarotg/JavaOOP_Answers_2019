package hanar.naver_test;

import java.util.Scanner;

// 이태경 20182645 git:hanarotg
class Circle {
	private double x, y;	
	protected int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	// show 메소드 수정 : 가장 큰 원에 관한 정보를 출력.
	public void show() {
		System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")"+ radius);
	}
}

// 클래스 이름 수정 CircleManager > Main
public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle [3];

		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();	 
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		int radiusMax = 0;
		
		// 각 원의 반지름 크기를 비교하여 가장 큰 원의 반지름 값을 저장
		for(int i=0; i<c.length; i++) {
			if(radiusMax < c[i].radius) {
				radiusMax = c[i].radius;
			}
		}
		
		// 반복문을 통해 가장 큰 반지름을 가진 원을 찾아 이를 출력한다.
		for(int i=0; i<c.length; i++) {
			if(radiusMax == c[i].radius) {
				c[i].show();
			}
		}
		
		scanner.close();
	}
}

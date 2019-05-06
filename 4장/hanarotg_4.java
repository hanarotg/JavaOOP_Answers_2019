package hanar.naver_test;

import java.util.Scanner;

// 이태경 20182645 git:hanarotg
class Rectangle {
	int x;
	int y;
	int width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width * height;
	}
	
	void show() {
		System.out.printf("(%d, %d) 에서 크기가  %d*%d인 사각형\n", x, y, width, height);
	}
	
	// 4개의 모서리가 r의 4개의 모서리보다 밖에 있는지 판단
	boolean contains(Rectangle r) {
		if(x < r.x && 
			y < r.y && 
			x+width > r.x + r.width &&
			y+height > r.y + r.height) {
			return true;
		} else {
			return false;
		}
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
		
		sc.close();
	}
}

package hanar.naver_test;

//20182645 이태경 git:hanarotg
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	
	// 어떠한 생성자를 사용하든 간에 color의 default 값은 BLACK 이므로
	String color = "BLACK";
	
	// 기본형태의 생성자를 이용할 경우 (0, 0) BLACK 
	public ColorPoint() {
		super(0, 0);
	}
	
	// 기본형태의 생성자를 이용하지 않는 경우
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	// 슈퍼클래스의 move 메소드 활용
	void setXY(int x, int y) {
		move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + "색의 " + "(" + getX() + ", " + getY() + ")의 점";
	}
}

public class Main {
	public static void main(String args[]){
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()  + "입니다.");
 }
}

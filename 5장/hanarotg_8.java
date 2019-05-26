package hanar.naver_test;

//20182645 이태경 git:hanarotg
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class PositivePoint extends Point {
	
	// 기본 형태의 생성자
	public PositivePoint () {
		super(0, 0);
	}
	
	public PositivePoint (int x, int y) {
		super(x, y);
		
		// 두 좌표값이 모두 양수가 아닐경우  (0,0) 으로  저장
		if(x < 0 || y < 0) {
			super.move(0, 0);
		} 
	}
	
	@Override
	protected void move(int x, int y) {
		// 두 좌표값이 모두 양수일 경우에만 슈퍼클래스의 move 메소드를 적용한다.
		if(x > 0 && y > 0) {
			super.move(x, y);
		}
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ")의 점입니다.";
	}
}

public class Main {
	public static void main(String args[]){
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(-5, 5); 
		System.out.println(p.toString() + "입니다.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");	
 }
}

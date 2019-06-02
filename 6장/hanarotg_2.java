package hanar.naver_test;

//20182645 이태경 git:hanarotg
// Circle 클래스
class Circle{
	
	int x; int y; int radius;
	// 생성자
	Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// toString 메소드 재정의
	@Override
	public String toString() {
		return "Circle("+ x + "," + y + ")반지름" + radius;
	}
	
	// 두 Circle 객체의 x,y값을 비교하는 메소드
	boolean equals(Circle CompareCircle) {
		if(x == CompareCircle.x && y == CompareCircle.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class Main{
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("다른 원");
		}
	}
}

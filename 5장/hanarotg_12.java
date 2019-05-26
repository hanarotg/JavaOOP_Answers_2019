package hanar.naver_test;

//20182645 이태경 git:hanarotg
abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }
	public Shape getNext() { return next; }
	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class Main {
	 public static void main(String [] args) {
		 System.out.println("그래픽 에디터 beauty를 실행합니다.");
		 System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)");
		 
		 
	}
}

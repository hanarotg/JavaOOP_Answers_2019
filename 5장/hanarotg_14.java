package hanar.naver_test;

//20182645 이태경 git:hanarotg
interface Shape {
	final double PI = 3.14;
	void draw(); 
	double getArea(); 
	default public void redraw() { 
		System.out.print("--- 다시 그립니다. ");
		draw();	
	}
}

// 원 클래스
class Circle implements Shape {
	
	int radius; 
	
	// 생성자 , 반지름 값을 받는다.
	public Circle(int radius) { 
		this.radius = radius;
	}
	
	// 인터페이스 내 메소드 오버라이딩
	@Override
	public void draw() {
		System.out.println(" 반지름이 " + radius + "인 원입니다.");
	}
	
	@Override
	public double getArea() { 
		return PI * radius * radius;
	}
}

// 타원 클래스
class Oval implements Shape {
	
	double a,b; 
	
	// 생성자 , 장축, 단축 값을 받는다.
	public Oval(double a, double b) { 
		this.a = a;
		this.b = b;
	}
	
	// 인터페이스 내 메소드 오버라이딩
	@Override
	public void draw() {
		System.out.println(a + "X" + b + "에 내접하는 타원입니다.");
	}
	
	@Override
	public double getArea() { 
		return PI * a * b;
	}
}

//사각형 클래스
class Rect implements Shape {
	
	double a,b; 
	
	// 생성자 , 가로길이 , 세로길이 값을 받는다.
	public Rect(double a, double b) { 
		this.a = a;
		this.b = b;
	}
	
	// 인터페이스 내 메소드 오버라이딩
	@Override
	public void draw() {
		System.out.println(a + "X" + b + "크기의 사각형입니다.");
	}
	
	@Override
	public double getArea() { 
		return a * b;
	}
}

public class Main {
	 public static void main(String [] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i = 0; i<list.length; i++) list[i].redraw();
		for(int i = 0; i<list.length; i++) System.out.println("면적은 " + list[i].getArea());
	}
}

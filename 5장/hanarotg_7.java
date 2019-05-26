package hanar.naver_test;

//20182645 이태경 git:hanarotg
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class Point3D extends Point {
	
	int z;
	
	public Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// z축을 한번 위로 이동
	void moveUp() {
		z++;
	}
	
	// z축을 한번  아래로 이동
	void moveDown() {
		z--;
	}
	
	// x, y, z 이동
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + z + ")의 점입니다.";
	}
}

public class Main {
	public static void main(String args[]){
		Point3D p = new Point3D(1,2,3); 
		System.out.println(p.toString() + "입니다.");

		p.moveUp(); 
		System.out.println(p.toString() + "입니다.");

		p.moveDown(); 
		p.move(10, 10); 
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");	
 }
}

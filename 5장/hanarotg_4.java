package hanar.naver_test;
import java.util.Scanner;

//20182645 이태경 git:hanarotg
abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String srcString(); // 추상 메소드
	abstract protected String destString(); // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}
}

class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	// 슈퍼 추상 클래스 내 메소드들을 오버라이딩하여 
	// 활용한다.
	@Override 
	protected String srcString() {
		return "Km";
	}
	
	@Override 
	protected String destString() {
		return "mile";
	}
	
	@Override 
	protected double convert(double src){
		return src/ratio;
	}
}

public class Main {
	public static void main(String args[]){
	Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
	toMile.run();
 }
}

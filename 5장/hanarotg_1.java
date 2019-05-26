package hanar.naver_test;

//20182645 이태경 git:hanarotg
class TV {
	 private int size;
	 public TV(int size) { this.size = size; }
	 protected int getSize() { return size; }
}

class ColorTV extends TV {
	 int inch;
	 int color;
	 public ColorTV(int inch, int color){
		 // 슈퍼클래스에 기본 생성자가 없는 경우 오류가 발생하므로 
		 // 명시적으로 슈퍼클래스의 생성자를 선택해야 한다.
		 super(inch);
	     this.inch = inch;
	     this.color = color;}
	 void printProperty(){ System.out.println(inch +"인치 " + color + "컬러");}
}

public class Main {
 public static void main(String args[]){
     ColorTV myTV = new ColorTV(32, 1024);
     myTV.printProperty();
 }
}

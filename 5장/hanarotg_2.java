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
		 super(inch);
	     this.inch = inch;
	     this.color = color;}
}

class IPTV extends ColorTV{
	String ipAdress;
	public IPTV(String ipAdress, int inch, int color) {
		super(inch, color);
		this.ipAdress = ipAdress;
	}
	
	void printProperty(){ 
		System.out.println("나의 IPTV는 " + ipAdress + "주소의 " + inch +"인치 " + color + "컬러");
	}
}

public class Main {
 public static void main(String args[]){
     IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
     iptv.printProperty();
 }
}

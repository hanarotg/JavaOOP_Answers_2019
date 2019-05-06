package hanar.naver_test;

import java.util.Scanner;
// 이태경 20182645	git:hanarotg

// 각 좌석에 대한 예약자 정보를 가지는 클래스 Site
class Site {
	protected String name;
	
	// 이름 저장 생성자
	Site(String name){
		this.name = name;
	}
	
	// 해당 좌석에 예약자 여부 확인
	boolean isReservated() {
		if(name.equals(null)) {
			return false;
		} else {
			return true; 
		}
	}
	
	// 예약자 정보 출력
	void show() {
		if(name.equals(null) == true) {
			System.out.println("--- ");
		} else {
			System.out.println(name + " ");
		}
	}
	
}

public class Main {
	
	void checkSelectNumber(int firstNumber, int lastNumber) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 2차원 객체 배열 생성
		Site s[][] = new Site[3][10];
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
		int selectNum = sc.nextInt();
		
		// 1~4 이외의 숫자를 입력한 경우
		while(selectNum < 1 || selectNum >4) {
			System.out.println("잘못된 숫자를 입력하였습니다. 1~4 이내 숫자를 입력해주세요.");
			selectNum = sc.nextInt();
		}
		
		// 4를 입력받기 전까지 반복
		while(selectNum != 4) {
			switch(selectNum) {
				case 1: // 예약 
					System.out.print("좌석구분 S(1), A(2), B(3)>>");
					int selectSiteLevel = sc.nextInt();
					
					// 1,2,3 이외의 값을 입력한 경우
					while(selectSiteLevel < 1 || selectSiteLevel > 3) {
						System.out.println("잘못된 숫자를 입력하였습니다. 1~3 이내 숫자를 입력해주세요.");
						selectSiteLevel = sc.nextInt();
					}
					
					// 입력한 등급에 맞는 좌석 조회
					for(int i = 0; i<10; i++) {
						s[selectSiteLevel-1][i].show();
					}
					
					// 희망 좌석 입력 및 확인
					System.out.print("이름>>");
					String selectName = sc.next();
					System.out.print("번호>>");
					int selectSiteNumber = sc.nextInt();
					
					// 이미 예약자가 존재하는 경우 다른 번호의 좌석을 배정받을때까지 반복
					while(s[selectSiteLevel-1][selectSiteNumber-1].isReservated() == true) {
							System.out.println("이미 예약자가 존재합니다 다른 번호 좌석을 선택하요 주십시오.");
							selectSiteNumber = sc.nextInt();
					}
			}
		}
		sc.close();
	}

}

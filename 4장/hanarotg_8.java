package hanar.naver_test;

import java.util.Scanner;

// 이태경 20182645 git:hanarotg
class Phone {	
	
	protected String name;
	protected String phoneNumber;
	
	// 멤버 정보를 저장하는 생성자
	public Phone(String name, String phoneNumber) {
		this.name = name; 
		this.phoneNumber = phoneNumber;
	}
	
	// show 메소드  : 검색 시 정보를 출력
	public void show() {
		System.out.println(name + "의 번호는  " + phoneNumber + " 입니다.");
	}
}

public class PhoneBook {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int manyPhones = sc.nextInt();
		
		// 입력할 객체의 크기 결정 및 정의
		Phone p [] = new Phone [manyPhones];
		
		// 각 멤버당 정보 입력
		for(int i=0; i<manyPhones; i++) {
			
			System.out.printf("이름과 전화번호 (이름과 번호는 빈칸없이 입력 >>");
			String name = sc.next();
			String phoneNumber = sc.next();	 
			
			p[i] = new Phone(name, phoneNumber);
		
		}
		
		System.out.println("저장되었습니다...");
		
		System.out.print("검색할 이름>>");
		String tmpName = sc.next();
		
		// '그만' 을 입력하기 전까지 반복
		while(tmpName.equals("그만") == false) {
			int j = 0;
			for(; j<manyPhones; j++) {
				
				// 검색한 이름이 있는 경우 정보를 출력하고 반복문을 종료
				if(p[j].name.equals(tmpName)) {
					p[j].show();
					break;
				}
			}
			
			// 검색한 이름이 없는 경우
			if(j == manyPhones) {
				System.out.println(tmpName + " 이 없습니다.");
			}
			
			System.out.print("검색할 이름>>");
			tmpName = sc.next();
		}
		
		sc.close();
	}
}

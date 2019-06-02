package hanar.naver_test;

import java.util.Scanner;

// 20182645 이태경  git:hanarotg
class Person{
	
	String name;
	
	// 생성자
	Person(String name){
		this.name = name;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String tmpString;
		int[] randArr = new int[3]; // 난수를 저장할 배열
		
		System.out.print("1번째 선수 이름>>");
		tmpString = sc.next();
		Person a = new Person(tmpString);
		
		System.out.print("2번째 선수 이름>>");
		tmpString = sc.next();
		Person b = new Person(tmpString);
		
		while(true) {
			
			// Person a의 차례 
			System.out.print("[" + a.name + "] : <Enter>>");
			tmpString = sc.nextLine();
			
			// 난수 생성 및 출력
			for(int i = 0; i<3; i++) {
				randArr[i] = (int)(Math.random()*3)+1;
				System.out.print("\t" + randArr[i]);
			}
			
			// 승패 판단 : 승리할 경우 
			if(randArr[0] == randArr[1] && randArr[1] == randArr[2]) {
				System.out.print("\t" + a.name + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("\t" + "아쉽군요!");
			}

			
			// Person b의 차례 
			System.out.print("[" + b.name + "] : <Enter>>");
			tmpString = sc.nextLine();
			
			// 난수 생성 및 출력
			for(int i = 0; i<3; i++) {
				randArr[i] = (int)(Math.random()*3)+1;
				System.out.print("\t" + randArr[i]);
			}
			
			// 승패 판단 : 승리할 경우 
			if(randArr[0] == randArr[1] && randArr[1] == randArr[2]) {
				System.out.print("\t" + b.name + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("\t" + "아쉽군요!");
			}
			
		}
		
		
	}
}

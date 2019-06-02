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
		int manyPerson; // 참여할 선수 수 저장
		
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		manyPerson = sc.nextInt();
		Person[] p = new Person[manyPerson]; // 선수 숫자에 맞게 객체 배열 생성
		
		// 각 선수의 이름을 저장
		for(int i = 0; i<manyPerson; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			tmpString = sc.next();
			p[i] = new Person(tmpString);
		}
		
		// 게임의 참여할 선수 번호 저장변수
		int j = 0;
		
		while(true) {
			
			// Person[i] 의 차례 
			System.out.print("[" + p[j].name + "] : <Enter>>");
			tmpString = sc.nextLine();
			
			// 난수 생성 및 출력
			for(int i = 0; i<3; i++) {
				randArr[i] = (int)(Math.random()*3)+1;
				System.out.print("\t" + randArr[i]);
			}
			
			// 승패 판단 : 승리할 경우 
			if(randArr[0] == randArr[1] && randArr[1] == randArr[2]) {
				System.out.print("\t" + p[j].name + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("\t" + "아쉽군요!");
			}
			
			// 마지막 번호의 선수가 게임을 했을 경우 다시 첫번째 선수가 게임을 진행
			if(j == manyPerson-1) {
				j = 0;
			} else {
				j++;
			}
		}
		
		
	}
}

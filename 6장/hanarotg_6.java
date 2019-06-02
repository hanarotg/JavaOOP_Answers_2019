package hanar.naver_test;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 캘린더 객체 생성
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		String tmpEnter; // <Enter> 입력을 받기 위한 변수
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		// 황기태 게임 측정 시작
		System.out.print("황기태 시작 <Enter키>>");
		
		tmpEnter = sc.nextLine();
		// 현재 시각을 다시 측정
		cal = Calendar.getInstance();
		long d1_s1 = cal.getTimeInMillis();
		System.out.println("현재 초 시간 " + cal.get(Calendar.SECOND));
		
		System.out.print("10초 예상 후 <Enter키>>");
		
		tmpEnter = sc.nextLine();
		// 현재 시각을 다시 측정
		cal = Calendar.getInstance();
		long d1_s2 = cal.getTimeInMillis();
		System.out.print("현재 초 시간 " + cal.get(Calendar.SECOND));
		
		// d1_s1 와 d1_s2 값의 차이를 구하여 초단위로 저장
		long d1_gap = (d1_s2 - d1_s1)/1000;
		
		System.out.println("");
		
		// 이재문 게임 측정 시작
		System.out.print("이재문 시작 <Enter키>>");
		
		tmpEnter = sc.nextLine();
		// 현재 시각을 다시 측정
		cal = Calendar.getInstance();
		long d2_s1 = cal.getTimeInMillis();
		System.out.println("현재 초 시간 " + cal.get(Calendar.SECOND));
		
		System.out.print("10초 예상 후 <Enter키>>");
		
		tmpEnter = sc.nextLine();
		// 현재 시각을 다시 측정
		cal = Calendar.getInstance();
		long d2_s2 = cal.getTimeInMillis();
		System.out.print("현재 초 시간 " + cal.get(Calendar.SECOND));
		
		// d1_s1 와 d1_s2 값의 차이를 구하여 초단위로 저장
		long d2_gap = (d2_s2 - d2_s1)/1000;
		
		// 황기태, 이재문이 예상한 입력의 실제 시간(초)를 각각 출력
		System.out.print("\n황기태의 결과 " + d1_gap + ", 이재문의 결과 " + d2_gap + ", 승자는");
		
		// d1_gap, d2_gap 중 무엇이 더 10초에 가까운지 판정한다.
		if(Math.abs(d1_gap - 10.0) < Math.abs(d2_gap - 10.0)) {
			System.out.print("황기태");
		} 
		else if(Math.abs(d1_gap - 10.0) == Math.abs(d2_gap - 10.0)) {
			System.out.print("공동우승");
		} else {
			System.out.print("이재문");
		}
		
	}

}

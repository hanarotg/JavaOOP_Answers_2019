package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		int n = 0; // 0~2 중 무작위로 정수를 저장하는  컴퓨터 관련 변수
		int i; // 반복문 내에서 사용자 입력 관련 변수, 
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.print("가위 바위 보!>>");
		String inputStr = sc.next();

		// '그만'을 입력하지 않은 경우 반복
		while(inputStr.equals("그만") == false) {
			
			// 컴퓨터의 결정을 무작위로 결정
			n = (int)(Math.random()*3);
			
			// 컴퓨터와 사용자의 결정을 비교
			for(i = 0; i<3; i++) {
				if(inputStr.equals(str[i])) {
					break;
				}
			}
			
			// 사용자와 컴퓨터가 가위 바위 보 중 무엇을 내었는지 출력
			System.out.print("사용자 = " + str[i] + ", 컴퓨터 = " + str[n] + ", ");
			
			// 사용자가 가위를 입력한 경우 i == 0
			if(i == 0) {
				if(n == 0) {
					System.out.println("비겼습니다.");
				} else if(n == 1) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else {
					System.out.println("사용자가 이겼습니다.");
				}
			} 
			// 사용자가 바위를 입력한 경우  i == 1
			else if(i == 1) {
				if(n == 0) {
					System.out.println("사용자가 이겼습니다.");
				} else if(n == 1) {
					System.out.println("비겼습니다.");
				} else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			// 사용자가 보를 입력한 경우 i == 2
			else if(i == 2){	
				if(n == 0) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else if(n == 1) {
					System.out.println("사용자가 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			}
			// 사용자가 가위 바위 보 가 아닌 다른 값을 입력했을 경우
			else {
				System.out.println("잘못된 입력!");
			}
			
			System.out.print("가위 바위 보!>>");
			inputStr = sc.next();
		}
		
		sc.close();
	}
}

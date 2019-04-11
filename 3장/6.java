package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		// 문제에서 제시한 배열 선언, 초기화
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String[] unitString = {"50000원 짜리","10000원 짜리","1000원 짜리","500원 짜리","100원 짜리","50원 짜리","10원 짜리","1원 짜리"};
		int howMuchMoney = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시요>>");
		int money = sc.nextInt();
		
		// 각 화폐와 동전 개수 출력 반복
		for(int i = 0; i<8; i++) {
			for(; money >= unit[i]; money -= unit[i]) {
				// 입력한 금액이 해당 배열 원소에 해당하는 금액의 갯수를 추가한다.
				howMuchMoney++;
			}
			// 출력
			System.out.println(unitString[i] + " : " + howMuchMoney + "개");
			howMuchMoney = 0;
		}
		
		sc.close();
	}
}

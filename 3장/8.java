package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int j = 0;
		
		System.out.print("정수 몇개?>>");
		int howManyInt = sc.nextInt();
		
		for(int i = 0; i<howManyInt; i++) {
			// 배열에 랜덤생성한 정수를 저장
			arr[i] = (int)(Math.random()*100 + 1);
			
			// 저장한 정수가 이전에 저장한 배열값과 같은지를 검사
			for(j = 0; j<i; j++) {
				// 이전 배열의 값과 저장한 정수가 같은 경우
				if(arr[j] == arr[i]) {
					break;
				}
			}
				
			// if문 통해 break한 경우, j값은 i값과 같지 않으므로 이를 이용한다.
			if(i != j) {
				// arr[j] 값과 arr[i] 값이 다를 때까지 랜덤한 정수를 arr[j]에 저장
				while(arr[j] == arr[i]) {
					arr[j] = (int)(Math.random()*100 + 1);
				}
			
			j = 0;
			}
				
			// 10개씩 같은 줄에 원소를 출력
			if(i%10 == 0 && i != 0) {
				System.out.println("");
			}
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}

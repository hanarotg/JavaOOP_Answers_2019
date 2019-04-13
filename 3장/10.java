package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		int arrSecondDim = (int)(Math.random()*4);
		int arrFirstDim = (int)(Math.random()*4);
		int[][] arr = new int[4][4];

		// 임의의 배열 위치에 임의의 정수를 대입한다. 이를 10번 반복
		for(int i = 0; i<10; i++) {
			
			// 무작위로 선정한 해당 배열 원소가 0이 나올 때까지 반복
			while(arr[arrSecondDim][arrFirstDim] != 0) {
				arrSecondDim = (int)(Math.random()*4);
				arrFirstDim = (int)(Math.random()*4);
			}
			
			// 0으로 초기화되어 있는 해당 배열에 임의의 정수값 저장
			arr[arrSecondDim][arrFirstDim] = (int)(Math.random()*10 + 1);
		
		}
		
		// 배열 출력
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}

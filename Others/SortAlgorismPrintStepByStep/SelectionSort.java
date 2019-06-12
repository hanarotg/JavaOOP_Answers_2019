package hanar.naver_test;

import java.util.Arrays;

//  선택정렬 클래스
class SelectionSort {
		
	int[] arr;
	
	// 생성자
	SelectionSort(int[] arr){
		this.arr = arr.clone();
	}
	
	// 선택 정렬 과정을 출력하는 메소드
	protected void print() {

		System.out.println("\n\n선택 정렬");
		System.out.println("--------------------------------------------------------------");
		System.out.println(Arrays.toString(arr));
		
		// n-1 번 반복
		for(int n = 0; n<15; n++) {
			
			// 최솟값을 가진 원소의 번호
			int minArrNum = n; 
			
			// n ~ 15번쨰 원소 중 가장 작은 값을 찾는다.
			for(int m = n; m<16; m++) {
				
				// 최솟값보다 작거나 같은 원소를 발견한 경우 
				if(arr[m] <= arr[minArrNum]) {
					minArrNum = m;
				}
			
			}
			
			// 최솟값을 가진 원소번호가 기본값과 다를 경우 
			// minArrNum번째 원소와 n번쨰 원소의 값을 바꾼다.
			if(minArrNum != n) {
				
				int tmpInt;
				tmpInt = arr[minArrNum];
				arr[minArrNum] = arr[n];
				arr[n] = tmpInt;
				
				// 바뀐 배열 출력
				System.out.println(Arrays.toString(arr));
			}
		}

		System.out.println("--------------------------------------------------------------");
	}
}

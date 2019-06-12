package hanar.naver_test;

import java.util.Arrays;

//  삽입정렬 클래스
class InsertionSort {
		
	int[] arr;

	// 생성자
	InsertionSort(int[] arr){
		this.arr = arr.clone();
	}
	
	// 삽입 정렬 과정을 출력하는 메소드
	protected void print() {

		System.out.println("\n\n삽입 정렬");
		System.out.println("--------------------------------------------------------------");
		System.out.println(Arrays.toString(arr));
		
		// 두번쨰 원소(1)부터 비교 기준이 된다.
		for(int n = 1; n<16; n++) {
			
			int intTmp = arr[n];
			
			// 이전 원소와 비교
			for(int m = n-1; m>=0; m--) {
				
				// 비교할 원소보다 큰 경우 
				if(intTmp > arr[m]) {
					arr[m+1] = intTmp;
					break;
				} 
				
				// 비교할 원소가 배열의 첫번쨰 원소이고 이 첫번째 원소보다 작은 경우
				else if(m == 0 && intTmp < arr[m]) {
					arr[m+1] = arr[m];
					arr[m] = intTmp;
					break;
				}
				
				// 비교할 원소보다 작거나 같은경우 비교한 원소값을 한 칸 뒤로 복사
				else {
					arr[m+1] = arr[m];
				}

			}
			
			System.out.println(Arrays.toString(arr));
			
		}
		

		System.out.println("--------------------------------------------------------------");
	}
}

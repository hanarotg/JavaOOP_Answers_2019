package hanar.naver_test;

import java.util.Arrays;

// 병합 정렬 클래스
class MergeSort {
		 
	int[] arr;

	// 생성자
	MergeSort(int[] arr){
		this.arr = arr.clone();
	}

	// 병합 정렬 과정을 출력하는 메소드
		protected void print() {

			System.out.println("\n\n병합정렬(MergeSort) - Conquer 과정 출력 after divide");
			System.out.println("--------------------------------------------------------------");
			System.out.println(Arrays.toString(arr));
		
			sort(arr, arr.length);
			
			System.out.println("--------------------------------------------------------------");
	}
	
	// divide를 수행하는 메소드
	private void sort(int[] arr, int n) {
			
			// 더이상 배열을 나눌 수 없는 경우 종료
		    if (n < 2) {
		        return;
		    }
		    
		    int mid = n / 2;
		    
		    // 중간값을 기준으로 두 배열 생성
		    int[] leftArr = new int[mid];
		    int[] rightArr = new int[n - mid];
		    
		    // 배열 값 저장
		    for (int i = 0; i < mid; i++) {
		        leftArr[i] = arr[i];
		    }
		    
		    for (int i = mid; i < n; i++) {
		        rightArr[i - mid] = arr[i];
		    }
		    
		    // 두 배열에 대해 재귀적으로 divide를 수행
		    sort(leftArr, mid);
		    sort(rightArr, n - mid);
		    
		    // conquer수행
		    merge(arr, leftArr, rightArr, mid, n - mid);
		    
		    System.out.println(Arrays.toString(arr));
	}
	
	// conquer를 수행하는 메소드
	private void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
			  
			int i = 0;
			int j = 0;
			int k = 0;
			    
			while (i < left && j < right) {
			    	
		    	// 나누어진 두 배열의 원소값을 비교하여 오름차순으로 정렬한다.
			    if (leftArr[i] <= rightArr[j]) {
			           arr[k++] = leftArr[i++];
			    }
			   	else {
			           arr[k++] = rightArr[j++];
			    }
			    	
			}
			    
			// i가 left가 될 때까지, j가 right가 될 때까지 arr에 순서대로 저장
			while (i < left) {
			    arr[k++] = leftArr[i++];
			}
			while (j < right) {
			    arr[k++] = rightArr[j++];
			}
			
	}
}

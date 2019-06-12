package hanar.naver_test;

import java.util.Arrays;

//  재귀정렬 클래스
class RecursiveSort {
		
	int[] arr;

	// 생성자
	RecursiveSort(int[] arr){
		this.arr = arr.clone();
	}
	
	// 재귀 버블 정렬 과정을 출력하는 메소드
	protected void print() {

		System.out.println("\n\n재귀 버블 정렬(Recursive Bubble Sort)");
		System.out.println("--------------------------------------------------------------");
		System.out.println(Arrays.toString(arr));
		
		sort(arr, arr.length);

		System.out.println("--------------------------------------------------------------");
	}
	
	// 재귀 버블 정렬 수행 메소드
	private void sort(int arr[], int n)
	    {
	        // 재귀적 수행 반복을 완료한 경우
	        if (n == 1) {
	            return;
	        }
	        
	        for (int i = 0; i<n-1; i++)
	        	
	        	// 이전 원소가 더 큰 경우
	            if (arr[i] > arr[i+1])
	            {
	                // 두 원소 교환
	                int tmpInt = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = tmpInt;
	                
	                System.out.println(Arrays.toString(arr));
	                
	            }
	        
	        // 재귀적 수행 반복
	        sort(arr, n-1);
	    
	    }
	
}

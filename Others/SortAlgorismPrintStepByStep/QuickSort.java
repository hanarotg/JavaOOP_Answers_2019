package hanar.naver_test;

import java.util.Arrays;

//  퀵정렬 클래스
class QuickSort {
		
	int[] arr;

	// 생성자
	QuickSort(int[] arr){
		this.arr = arr.clone();
	} 
	
	// 퀵 정렬 과정을 출력하는 메소드
	protected void print() {

		System.out.println("\n\n퀵 정렬(QuickSort)");
		System.out.println("--------------------------------------------------------------");
		System.out.println(Arrays.toString(arr));
		
		// 0:시작원소번호
		quickSort(arr, 0, 15);
		
		System.out.println("--------------------------------------------------------------");
	}
	
	// 배열을 피봇의 기준에 따라 나누고 새로운 값을 리턴하는 메소드
	// begin : 시작 원소번호, end : 마지막 원소번호
	private int partition(int arr[], int begin, int end) {
		
		// 피봇을 마지막 원소로 지정
	    int pivot = arr[end];
	    int i = begin-1;
	 
	    for (int j = begin; j < end; j++) {
	    	
	        if (arr[j] <= pivot) {
	            i++;
	            
	            // 교환
	            int tmpInt = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmpInt;
	            
	        }
	        
	    }
	    
	    // 두 원소의 위치를 바꾼다.
	    int tmpInt = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = tmpInt;

    	System.out.println(Arrays.toString(arr));
    	
	    return i+1;
	}

	// 퀵 정렬 과정을 수행하는 메소드, 자료구조 제공 프레젼테이션 코드 참조
	private void quickSort(int arr[], int begin, int end) {
	   
		if (begin < end) {

	    	int partitionIndex = partition(arr, begin, end);
	    	
	    	// 재귀적 수행
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
   
	    }
	
	}
	
}

package hanar.naver_test;

import java.util.Arrays;

//  힙정렬 클래스
class HeapSort { 
		
	int[] arr;

	// 생성자
	HeapSort(int[] arr){
		this.arr = arr.clone();
	}
	
	// 힙 정렬 과정을 출력하는 메소드
	protected void print() {

		System.out.println("\n\n힙  정렬(HeapSort)");
		System.out.println("--------------------------------------------------------------");
		System.out.println(Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("--------------------------------------------------------------");
	}
	
	// heap 메소드를 수행하고 정렬을 적용하는 메소드
    private void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // 배열의 절반으로 heap 메소드 수행
        for (int i = n/2-1; i >= 0; i--) {
            heap(arr, n, i); 
        }
        
        // 정렬 과정 반복 및 출력
        for (int i = n-1; i>=0; i--) 
        { 

            int tmpInt = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = tmpInt; 
  
            heap(arr, i, 0); 
            
    		System.out.println(Arrays.toString(arr));
        } 
    } 
    
    // CBT에서 maxInt를 찾아 정렬하는 메소드
    private void heap(int arr[], int n, int i) {
    	
    	// Complete Binary Tree 의 성질을 이용한다.
        int maxInt = i;  
        int leftChild = 2*i + 1; 
        int rightChild = 2*i + 2; 
  
        // 루트보다 왼쪽 자식이 더 큰 경우 
        if (leftChild < n && arr[leftChild] > arr[maxInt]) { 
            maxInt = leftChild; 
        }
        
        // 루트보다 오른쪽 자식이 더 큰 경우
        if (rightChild < n && arr[rightChild] > arr[maxInt]) { 
            maxInt = rightChild; 
    	}
        
        // 위 조건문을 통해 maxInt이 초기값이 아닌경우
        if (maxInt != i) 
        { 
        	// 교환
            int tmpInt = arr[i]; 
            arr[i] = arr[maxInt]; 
            arr[maxInt] = tmpInt; 
  
            // 재귀적 수행
            heap(arr, n, maxInt); 
        } 
    } 
}

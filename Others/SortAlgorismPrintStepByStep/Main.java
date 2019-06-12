package hanar.naver_test;

/* 20182645 git:hanarotg
	자료구조 과제_4. 6개의 sort 알고리즘 과정 출력하기
 */
public class Main {

	public static void main(String[] args) {

			// 16개의 난수를 저장할  정수 배열 생성
			int[] arr = new int[16];
			
			//  난수를 생성하여  값을 배열에 저장
			for(int i = 0; i<16; i++) {
				arr[i] = (int)(Math.random() *99);
			}
			
			SelectionSort selectionSort = new SelectionSort(arr); //  선택정렬 객체 생성
			InsertionSort insertionSort = new InsertionSort(arr); // 삽입정렬 객체 생성
			RecursiveSort recursiveBubbleSort = new RecursiveSort(arr); // 재귀 버블정렬 객체 생성
			QuickSort quickSort = new QuickSort(arr); // 퀵정렬 객체 생성
			MergeSort mergeSort = new MergeSort(arr); // 병합 정렬 객체 생성
			HeapSort heapSort = new HeapSort(arr); // 힙정렬 객체 생성
			
			//  선택 정렬 과정 출력
			selectionSort.print();
			
			// 삽입 졍렬 과정 출력
			insertionSort.print();
			
			// 재귀 정렬 과정 출력
			recursiveBubbleSort.print();
			
			// 퀵 정렬 과정 출력
			quickSort.print();
			
			// 병합정렬 과정 출력
			mergeSort.print();
			
			// 힙정렬 과정 출력
			heapSort.print();
			
	}

}

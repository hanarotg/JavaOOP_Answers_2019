package test;

import java.util.Scanner;
import java.util.Arrays;
//20182605 남윤건
public class Four {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scan = new Scanner(System.in);
		int [] array = new int[3];//입력 받을 값 배열
		array[0] = scan.nextInt();
		array[1] = scan.nextInt();
		array[2] = scan.nextInt();
		
		Arrays.sort(array);//정렬 함수
		
		System.out.print("중간 값은 " + array[1]);//중간 값 출력

		scan.close();
	}
}

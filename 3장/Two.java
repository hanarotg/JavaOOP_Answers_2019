package test;

import java.util.Arrays;

//20182605 남윤건
public class Two {
	public static void main(String[] args) {
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};

		for(int i = 0; i < 5; i++) {//0번째 배열부터 4번째 배열까지
			System.out.println(Arrays.toString(n[i]).replaceAll("[\\[\\],]",""));//배열을 찍어라
		}
		
	}
}

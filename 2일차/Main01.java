package com.tjoeun.main.chap02;

import java.util.Arrays;
import java.util.Random;

public class Main01 {

	public static void main(String[] args) {
		
//		이 문제를 해결해보세요~
//		무작위 정수 100(0~5)개를 저장한 배열을 생성하여 리턴하는 메소드 작성
//		현재 클래스에서만 사용할 메소드라면 private으로 선언한다.
//		main method에서 호출하려면 해당 메소드는 static 으로 선언한다.
		int[] arr = createIntArr();
		System.out.println(Arrays.toString(arr));
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
			
	}
	
	public static int[] createIntArr() {
		Random rd = new Random();
		int[] nums = new int[100];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = rd.nextInt(6);
//			System.out.print(arr[i] + " ");
		}
		return nums;
	}

}

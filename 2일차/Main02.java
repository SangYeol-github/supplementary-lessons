package com.tjoeun.main.chap02;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
	
	
	public static void main(String[] args) {
		
		
//		getIntArrSum() 메소드를 선언하고 파라미터로 정수배열을 받아서
//		그 원소들의 총합을 계산하여 그 수를 리턴하는 메소드 작성
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a]; 
		int num = getIntArrSum(arr);
		System.out.println("총합 : " + num);

	}

	private static int getIntArrSum(int[] arr) {
		Random ran = new Random();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
		}
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}

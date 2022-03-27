package com.tjoeun.main.chap02;

import java.util.Scanner;

import com.tjoeun.vo.Emp;

public class Main07 {

	public static void main(String[] args) {
		
//		키보드에서 입력된 값을 이용하여 인스턴스 초기화 하기
//		키보드 입력
		
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();		// 키보드에서 입력된 문자열(단어) 1개를 변수에 저장
//		int age = sc.nextInt();			// 키보드에서 입력된 정수를 변수에 저장
//		String line = sc.nextLine();	// 키보드에서 입력된 한 행 전체를 변수에 저장
//		nextLine()은 입력된 개행문자까지 읽어오기 때문에 입력버퍼에 남는 것이 없다.
		
//		Emp 클래스를 선언
//		회사명, 사번, 이름, 부서를 저장할 속성을 선언.
//		키보드에서 입력된 데이터로 사원정보 3인분을 생성하고 화면에 표시해보세요.
		
		Scanner sc = new Scanner(System.in);
		Emp[] emp = new Emp[3];
		
//		for(int i=0; i<emp.length; i++) {
//			emp[i] = new Emp();
//		}
		
		for(int i=0; i<emp.length; i++) {
			emp[i] = new Emp();
			System.out.print("사번을 입력해주세요 : ");
			int a = sc.nextInt();
			emp[i].setEmpno(a);
			
			sc.nextLine();
			
			System.out.print("이름을 입력해주세요 : ");
			String b = sc.nextLine();
			emp[i].setName(b);
			
			System.out.print("부서를 입력해주세요 : ");
			int c = sc.nextInt();
			emp[i].setDeptno(c);
			
			sc.nextLine();
			
		}
		
		for(int i=0; i<emp.length; i++) {			
			System.out.printf("회사명 : %s, 사번 : %d, 이름 : %s 부서 : %d \n", 
					Emp.getCompany(), emp[i].getEmpno(), emp[i].getName(), emp[i].getDeptno());
		}
		
		
	}

}

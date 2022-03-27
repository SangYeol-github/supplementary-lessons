package com.tjoeun.main.chap02;

public class Main05 {

	public static void main(String[] args) {
//		자바프로그램 작성
//		*.java > *.class > 실행 > static 멤버만 사용 가능, main 자동 실행 > 인스턴스멤버 사용하려면 인스턴스를 생성해야 한다
//		인스턴스 생성방법 : new 
//		new 를 사용하여 인스턴스를 생성할 때마다 인스턴스 멤버변수가 중복되어 생성된다.
		
//		static 변수 : 프로그램 시작 시 자동으로 1회만 생성
//		static method : 자동으로 로드, 인스턴스 생성없이 바로 호출 가능.
//		인스턴스 변수 : 인스턴스를 생성하고 그 참조를 사용하여 접근가능
//		인스턴스 method : 인스턴스를 생성하고 그 참조를 
		
//		static 메소드 안에서 인스턴스 메소드를 직접 호출 가능할까?
		
//		printMsg()
		Main05 m = new Main05();
		m.printMsg();
		
//		static method ? : static 변수의 값을 처리
//		instance method ? : instance 변수의 값을 처리
//		실행 시에 바로 사용가능한 멤버 ?
		
//		class Test {
		
//			static int count = 0;
//			int num = 0;
//			public Test() {
		
//			}
//		}
//		위 클래스의 인스턴스를 생성할 때, 총 몇개의 인스턴스가 생성되어 있는지 그 수를
//		기억하려고 한다.
//		또 인스턴스가 생성될 때마다 그 인스턴스의 번호를 해당 인스턴스에 기억하려고 한다.

	}
	
	private void printMsg() {
		System.out.println("여기는 인스턴스 메소드");
	}
	

}

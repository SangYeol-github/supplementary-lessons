package com.tjoeun.main.chap02;

public class Main03 {
	
	static float f1 = 3.14F; // 클래스 로드 될때 단 한 번만 로드.
	
	int age = 25;
	
	public static void main(String[] args) {
		
//		System.out.println("f1 = " + f1);    // static
//		System.out.println("age = " + age); err
//		
//		Main3 m = new Main3();				// non-static
//		System.out.println("age = " + m.age);
		
//		age변수 3개를 메모리에 로드하고 각 3개의 임의의 정수를 대입하고
//		대입된 값을 화면에 표시해보세요.
		
		Main03 m1 = new Main03();				
		Main03 m2 = new Main03();				
		Main03 m3 = new Main03();				
		m1.age = 10;
		m2.age = 20;
		m3.age = 30;
		System.out.println("m1 = " + m1.age);
		System.out.println("m2 = " + m2.age);
		System.out.println("m3 = " + m3.age);
		
		m1.f1 = 1.2F;
		m2.f1 = 2.3F;
		m3.f1 = 3.4F;
		
		System.out.printf("%f %f %f\n", m1.f1, m2.f1, m3.f1);
		
		
//		클래스 영역에 선언할 수 있는 것들 : 변수, 메소드, 생성자
//		Java의 멤버 2가지
//		- 클래스 영역에 선언할 수 있는 변수, 메소드
//		- 멤버 변수, 멤버 메소드
//		- 멤버 변수에도 2가지 : static, non-static
//		- static 변수 : 정적 변수, static 변수, class 변수
//		- non-static 변수 : 객체변수, non-static 변수, 인스턴스 변수
		
//		클래스 작성(.java) > compile(.class) > 클래스 로드 > 객체 생성 > Heap 영역에 인스턴스 생성
		
//		클래스가 로드되었을 때 사용가능한 멤버 : static 변수/메소드
//		객체를 생성해야한 사용가능한 멤버 : non-static 변수/메소드
		

//		게시판 글 리스트(BoardVO)
//		class BoardVO {
			
//			private static int num; (x)		1개만 저장 가능
//			private int num;		(o)	
//			private static String title;
//			private String title;
		
//		}
		
//		BoardVO b1 = new BoardVO();  static 이랑 아무런 관련이 없음.
//		BoardVO b2 = new BoardVO();
		
//		1. 제목 1
//		2. 제목 2
//		...
		
//		자바프로그램 작성
//		*.java > *.class > 실행 > static 멤버만 사용 가능, main 자동 실행 > 인스턴스멤버 사용하려면 인스턴스를 생성해야 한다
//		인스턴스 생성방법 : new 
//		new 를 사용하여 인스턴스를 생성할 때마다 인스턴스 멤버변수가 중복되어 생성된다.
		
//		static 변수 : 프로그램 시작 시 자동으로 1회만 생성
//		static method : 자동으로 로드, 인스턴스 생성없이 바로 호출 가능.
//		인스턴스 변수 : 인스턴스를 생성하고 그 참조를 사용하여 접근가능
//		인스턴스 method : 인스턴스를 생성하고 그 참조를 
		
	}

}

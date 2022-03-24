package chap01;

import java.util.Scanner;

public class Main1 {

	static float f1 = 3.14F;
//	System.out.println("f1="+f1); method 안에 없어서 실행 X -> 부를 방법이 없음.
	
	public static void main(String[] args) {
//		public 공공의 static 정적인(인스턴스(new) 생성 X 호출 가능) void(return 값이 X) main(method)
//		정보를 처리한다. 정보{ }  전달창구(Parameter list) ( )
//		main method는 리턴 타입이 반드시 void 이어야함.	

//		키보드에서 입력된 2개의 정수를 덧셈하고
//		그 결과를 덧셈식과 함께 화면에 표시한다.
		int num = 0; // 변수 초기화.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 입력: ");
		int a = sc.nextInt();
		
		System.out.print("숫자 2 입력: ");
		int b = sc.nextInt();
		
		int c = a + b; // 기억의 필요성.
		System.out.printf("%d + %d = %d \n", a, b, c);
		
		System.out.println("f1="+f1);
		
		pintAdd(a, b); // 메소드 호출
		
		int res = getAdd(a,b);
		System.out.printf("%d + %d = %d \n", a, b, res);
		System.out.printf("%d + %d = %d \n", a, b, getAdd(a,b));
		
//		위에서 기억된 a, b 값을 max() 메소드에 전달하여 그 중 큰 수를 추출하여 
//		main()안에서 화면에 표시하도록 코드를 완성해보세요.
		
		max(a,b);
		System.out.println(max(a,b));
		
	}

	private static int max(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	
}

	private static int getAdd(int a, int b) {
	
		return a+b;
}

	private static void pintAdd(int a, int b) {
		
		System.out.printf("%d + %d = %d \n", a, b, a+b);
		
	}

}

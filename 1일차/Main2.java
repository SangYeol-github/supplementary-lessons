package chap01;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int rnum = ran.nextInt(10)+1; // 1~10
//		의 방법으로 숫자를 추출하여 1~3 : 0, 4~6: 1, 7~10: 2
//		위의 방법으로 0,1,2 를 리턴하는 메소드를 작성하고  그 결과를 화면에 표시.
		
		getNum(rnum);
		System.out.println(getNum(rnum));
		
//		일반변수?,		배열변수?
		int a = 10; // 4byte(32비트) 정수공간을 메모리에 할당
		a = 5;
		
//		배열변수(참조변수)
		int[] arr; // 배열변수 선언  정수의 주소가 저장된다.
		arr = new int[5]; // 주소값을 할당. 메모리 할당(확보)
		arr[0] = 2;  // 배열변수 초기화. 
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 6;
		arr[4] = 4;
		
//		addAll 메소드를 선언하고 위의 배열의 참조를 전달하여 그 합을 리턴하도록 
//		addAll 메소드를 작성해보세요.
		
		addAll(arr);
		System.out.println("합계: " + addAll(arr));
		
//		createArray() 를 호출하면 무작위 정수 5개를 저장한 배열이 리턴되도록 해보세요.
//		printArray 라는 이름의 메소드를 작성하여 완성해보세요.
		int[] ast = createArray();
		printArray(ast);
		
	}

	private static void printArray(int[] ast) {
		for(int i=0; i<ast.length; i++) {
			System.out.print(ast[i] + " ");
		}
		
	}

	private static int[] createArray() {
		int[] arr = new int[5];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;;
		}
		return arr;
		
	}

	private static int addAll(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
		
	}

	private static int getNum(int a) {
		if(a==1 || a==2 || a==3) {
			return 0;
		} else if(a==4 || a==5 || a==6) {
			return 1;
		} else {
			return 2;
		}
		
	}

}

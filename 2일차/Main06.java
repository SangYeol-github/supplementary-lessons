package com.tjoeun.main.chap02;

public class Main06 {

	public static void main(String[] args) {
		
		Test[] t = new Test[5];
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Test();
		}
		
		System.out.println("생성된 총 인스턴스 수: " + Test.count);
		
		for(int i=0; i<t.length; i++) {
			 System.out.println(t[i].num);
		}
		
		
	}

}

class Test {

	static int count = 0;
	int num = 0;
	public Test() {
		
		num = ++count;
	}
}
// 위 클래스의 인스턴스를 생성할 때, 총 몇개의 인스턴스가 생성되어 있는지 그 수를
// 기억하려고 한다.
// 또 인스턴스가 생성될 때마다 그 인스턴스의 번호를 해당 인스턴스에 기억하려고 한다.
// 총 5개의 인스턴스를 생성하고 필요할 때는 언제든지 생성된 총 인스턴스의 수와 각 
// 인스턴스의 번호를 화면에 표시할 수 있어야 한다.

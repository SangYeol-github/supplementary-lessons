package com.tjoeun.main.chap02;

import java.util.Objects;

class Emp1 {
	
	int num;
	
	
//	두 Emp 객체를 equals() 메소드를 사용하여 비교할 때,
//	사번이 동일한 2개의 객체는 동일하다고 결정하라고 개조.
	@Override
	public boolean equals(Object obj) {
		Emp1 other = (Emp1)obj;
		
		return this.num==other.num;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(this.num);
	}
	
}

public class Main09 {

	public static void main(String[] args) {
		
		Emp1 e1 = new Emp1();
		e1.num = 11;
		
		Emp1 e2 = new Emp1();
		e2.num = 11;
		
		boolean isSame = e1.equals(e2);
		System.out.println("동일성 여부 : " + isSame);
		
	}

}

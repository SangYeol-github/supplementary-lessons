package com.tjoeun.main.chap02;

import com.tjoeun.vo.Emp;

public class Main08 {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp();
		emp1.setName("hong");
		emp1.setDeptno(20);
		emp1.setEmpno(10);
		String a = emp1.getLine();
		System.out.println(a);
		
		
	}

}

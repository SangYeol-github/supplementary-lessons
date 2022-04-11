package com.tjoeun.chap04;

import com.tjoeun.vo.Student;

public class Main {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("smith");
		System.out.println(st.getName());
		changeName(st);
		System.out.println(st.getName());
		
	}
	
	private static void changeName(Student st) {
		st.setName("Andrew");
	}
	
	private static void dependencyTest() {
		
		Student st = new Student();
		st.setPhone("010-2547-9520");
		
	}
 	

}

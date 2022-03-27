package com.tjoeun.main.chap02;

import java.util.ArrayList;
import java.util.List;

import com.tjoeun.vo.Emp;

public class Main10 {

	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		Emp.setCompany("종로식당");
		list.add(new Emp(11,"Ward",20));
		list.add(new Emp(12,"Scott",30));
		list.add(new Emp(13,"Blake",40));
		
		int idx = list.indexOf(new Emp(14,"Smith",20)); // -1 존재 x
		
		System.out.println("dix : " + idx);  
		
	}

}

package com.tjoeun.vo;

import java.util.Objects;


public class Emp extends Object {
	
	private static String company = "tjoeun";
	private int empno;
	private String name;
	private int deptno;
	
	public Emp() {}
	
	public Emp(int empno, String name, int deptno) {
		this.empno = empno;
		this.name = name;
		this.deptno = deptno;
	}
	
	public String getLine() {
		
		return String.format("%s %d %s %d", company, empno, name, deptno);
	}
	
//	두 Emp 객체를 eqlauls() 메소드를 사용하여 비교할때
	
	@Override
	public boolean equals(Object obj) {
		Emp other = (Emp)obj;
		
		return this.empno==other.empno;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(this.empno);
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptno() {
		return deptno;
	}
	public static void setCompany(String company) {
		Emp.company = company;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public static String getCompany() {
		return company;
	}

}

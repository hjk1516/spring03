package com.example.spring;

public class DeptExample {

	public static void main(String[] args) {
		
		Dept dept = new Dept(); // 생성
		dept.setDeptno(10);		// Deptno = 10으로 초기화
		dept.setDname("개발부");	// Dname = 개발부로 초기화
		dept.setLoc("서울");		// Loc = 서울로 초기화
		
		System.out.println(dept);
		System.out.println(dept.getDeptno() + ", " + dept.getDname() + ", " +dept.getLoc());
		
	
	}
}

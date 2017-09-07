package com.example.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor //생성자를 만들어줌 ! 
@NoArgsConstructor // default 생성자 만든다 ! 
public class Dept {
	
	int deptno;
	String dname;
	String loc;
	
	public void print() {
		System.out.println("###"+toString());
	}
	public void print2() {
		System.out.println("###"+toString());
	}
}

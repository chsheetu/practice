package com.miit;
//learning class in java
public class EmpData {
	int age;
	String name;
	public EmpData(int age, String name) {
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		EmpData obj1=new EmpData(30,"Bob");
		EmpData obj2=new EmpData(40,"Rob");
		
		System.out.println(obj1.age + ("his name is")+obj1.name);
		System.out.println(obj2.age);
		

	}

}

package com.java.practice.SpringCore;

public class Alien {

	
	private int age;
	private Computer comp;
	


	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("setter called");
	}

	public Alien() {
		System.out.println("Inside Constructor");
	}
	
	
	

	public void code() {
		// TODO Auto-generated method stub
		
		System.out.println("In Coding .......");
		comp.compile();
		//System.out.println(age);
		
	}

	
	
	

}

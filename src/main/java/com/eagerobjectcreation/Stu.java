package com.eagerobjectcreation;

public class Stu {
	public static Stu s=new Stu();
	private Stu() {
		
	}
	public static Stu getInstance() {
		return s;
	}

}

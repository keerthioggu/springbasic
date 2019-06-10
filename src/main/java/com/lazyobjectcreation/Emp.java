package com.lazyobjectcreation;

public class Emp {
	public static Emp e=null;
	private Emp() {
		
	}
	public static Emp getInstance() {
		if(e==null){
			e=new Emp();
			return e;
		}else {
			return e;
				
		}
	}
	
}

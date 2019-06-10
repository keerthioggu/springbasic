package com.lazyobjectcreation;

public class Test {
public static void main(String[] args) {
	Emp e1=Emp.getInstance();
	Emp e2=Emp.getInstance();
	Emp e3=Emp.getInstance();
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);

}
}

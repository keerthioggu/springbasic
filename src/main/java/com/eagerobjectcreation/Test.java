package com.eagerobjectcreation;

public class Test {
public static void main(String[] args) {
	Stu s1=Stu.getInstance();
	Stu s2=Stu.getInstance();
	Stu s3=Stu.getInstance();
 
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);

}
}

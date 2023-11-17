package com.excelr.day6;

class Student
{
	int id;
	String name;
	String course;
	static final String COMPANY ="excelr";
	
	
}


public class StaticVariableDemo {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.id=1;
		s1.name="sachin";
		s1.course="java";
		//s1.COMPANY="a";
		
		Student s2 = new Student();
		s2.id=2;
		s2.name="ravi";
		s2.course="python";
		//s2.COMPANY="b";

		
		
		Student s3 = new Student();
		s3.id=3;
		s3.name="john";
		s3.course="java";
		//s3.COMPANY="c";

		
		System.out.println(s1.id +" "+ s1.name +" "+ s1.course +" "+s1.COMPANY);
		System.out.println(s2.id +" "+ s2.name +" "+ s2.course +" "+ s2.COMPANY);
		System.out.println(s3.id +" "+ s3.name +" "+ s3.course +" "+ s3.COMPANY);

		
		
		
	}

}

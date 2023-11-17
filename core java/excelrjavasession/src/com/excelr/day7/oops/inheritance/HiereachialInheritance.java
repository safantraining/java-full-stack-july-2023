package com.excelr.day7.oops.inheritance;

class Course
{
	 int courseId=1441;
	 String courseName="full stack java";
}

class Online extends Course
{
	String mode="online, login through wifi connected web cam device";
	
	void doCourse()
	{
		System.out.println("course ID:"+ courseId);
		System.out.println("course Name:"+ courseName);
		System.out.println("mode :"+ mode);
	}
	
}

class Offline extends Course
{
     String mode="physical, instructor led class";
	
	void doCourse()
	{
		System.out.println("course ID:"+ courseId);
		System.out.println("course Name:"+ courseName);
		System.out.println("mode :"+ mode);
	}
	
	
}

public class HiereachialInheritance {

	public static void main(String[] args) {

		Online online = new Online();
		
		Offline offline = new Offline();
		
		online.doCourse();
		System.out.println("=============");
		offline.doCourse();
		
	}

}

package com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public List<Course> courses;
	
	public TestGeneric()
	{
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd()
	{
		Course cr1 = new Course("1", "one");
		courses.add(cr1);
		Course cr2 = new Course("2", "two");
		courses.add(cr2);
	}
	
	public void testForecah()
	{
		for(Course cr:courses)
		{
			System.out.println("课程：" + cr.id + "-" + cr.name);
		}
		System.out.println("===========================");
	}
	
	public void testChild()
	{
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "子类型";
		courses.add(ccr);
	}

	public static void main(String[] args) {
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForecah();
		tg.testChild();
		tg.testForecah();
	}

}

package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	public SetTest()
	{
		coursesToSelect = new ArrayList<Course>();
	}
	public void testAdd()
	{
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(cr2);
		
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		
		Course[] course1 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(Arrays.asList(course1));
	}
	
	public void testForecah()
	{
		System.out.println("foreach。有下列课程");
		for(Object obj:coursesToSelect)
		{
			Course cr = (Course) obj;
			System.out.println("课程：" + cr.id + "-" + cr.name);
		}
	}

	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.testAdd();
		st.testForecah();
		
		Student student = new Student("1", "maike");
		System.out.println("welcome to 选课" + student.name + " 同学");
		
		Scanner console = new Scanner(System.in);
		for(int i = 0;i < 3;i++)
		{
			System.out.print("请输入课程ID:");
			String courseId = console.next();
			for(Course cr:st.coursesToSelect)
			{
				if(cr.id.equals(courseId))
				{
					student.courses.add(cr);
					System.out.println("已选择:" + cr.id + "-" + cr.name);
				}
			}
		}
		st.testForEachForSet(student);
	}
	
	public void testForEachForSet(Student student)
	{
		System.out.println("======================================");
		System.out.println("共选了" + student.courses.size() + "门课");
		System.out.println("已选所有课程：");
		for(Course cr:student.courses)
		{
			System.out.println(cr.id + "-" + cr.name);
		}
		System.out.println("======================");
	}

}

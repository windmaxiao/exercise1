package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public List coursesToSelect;
	
	public ListTest()
	{
		this.coursesToSelect = new ArrayList();
	}
	public void testAdd()
	{
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("已添加课程:" + temp.id + "-" + temp.name);
		
		Course cr0 = new Course("1", "数据结构");
		coursesToSelect.add(0,cr0);
		Course temp0 = (Course) coursesToSelect.get(0);
		System.out.println("已添加课程:" + temp0.id + "-" + temp0.name);
		
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp1 = (Course) coursesToSelect.get(0);
		System.out.println("已添加课程:" + temp1.id + "-" + temp1.name);
		
		Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		
		Course temp2 = (Course) coursesToSelect.get(3);
		Course temp3 = (Course) coursesToSelect.get(4);
		System.out.println("已添加课程:" + temp2.id + "-" + temp2.name);
		System.out.println("已添加课程:" + temp3.id + "-" + temp3.name);
		
		Course[] course1 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(3, Arrays.asList(course1));
		Course temp4 = (Course) coursesToSelect.get(3);
		Course temp5 = (Course) coursesToSelect.get(4);
		System.out.println("已添加课程:" + temp4.id + "-" + temp4.name);
		System.out.println("已添加课程:" + temp5.id + "-" + temp5.name);
	}
	
	public void testGet()
	{
		int size = coursesToSelect.size();
		System.out.println("有如下课程：");
		for(int i = 0;i < size;i++)
		{
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + "-" + cr.name);
		}
	}
	
	public void testIterator()
	{
		Iterator it = coursesToSelect.iterator();
		System.out.println("迭代器。有下列课程");
		while(it.hasNext())
		{
			Course cr = (Course) it.next();
			System.out.println("课程：" + cr.id + "-" + cr.name);
		}
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
	
	public void testModify()
	{
		coursesToSelect.set(2, new Course("7", "毛概"));
	}
	
	public void testRemove()
	{
		Course cr = (Course) coursesToSelect.get(2);
		System.out.println("课程 [" + cr.id + "-" + cr.name + "] 即将被删除");
		coursesToSelect.remove(cr);
		System.out.println("删除完成，现有课程如下：");
		testForecah();
	}
	
	public static void main(String[] args)
	{
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForecah();
		lt.testModify();
		lt.testForecah();
		lt.testRemove();
	}
}

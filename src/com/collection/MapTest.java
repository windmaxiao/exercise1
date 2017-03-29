package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String, Student> students;
	
	public MapTest()
	{
		this.students = new HashMap<String, Student>();
	}
	public void TestPut()
	{
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i<3)
		{
			System.out.print("输入ID：");
			String id = console.next();
			Student st = students.get(id);
			if(st == null)
			{
				System.out.print("输入姓名：");
				String name = console.next();
				Student newStudent = new Student(id, name);
				students.put(id, newStudent);
				System.out.println("添加成功" + students.get(id).name);
				i++;
			}
			else
			{
				System.out.println("此ID已存在");
				continue;
			}
		}
		System.out.println("=======================");
	}
	
	public void TestKeySet()
	{
		Set<String> KeySet = students.keySet();
		System.out.println("有" + students.size() + "个学生");
		for (String stuId : KeySet) 
		{
			Student st = students.get(stuId);
			if(st != null)
			{
				System.out.println("学生：" + st.name);
			}
		}
		System.out.println("=======================");
	}
	
	public void TestRemove()
	{
		Scanner console = new Scanner(System.in);
		while(true)
		{
			System.out.print("输入要删除的ID：");
			String id = console.next();
			Student st = students.get(id);
			if(st == null)
			{
				System.out.println("ID不存在");
				continue;
			}
			students.remove(id);
			System.out.println("成功删除" + st.name);
			break;
		}
		System.out.println("=======================");
	}
	
	public void TestEntrySet()
	{
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) 
		{
			System.out.println("取得键" + entry.getKey() + " 值" + entry.getValue().name);
		}
		System.out.println("=======================");
	}
	
	public void TestModify()
	{
		System.out.print("要修改的ID：");
		Scanner console = new Scanner(System.in);
		while(true)
		{
			String id = console.next();
			Student st = students.get(id);
			if(st == null)
			{
				System.out.println("ID不存在");
				continue;
			}
			System.out.println("当前学生为" + st.name);
			System.out.print("输入新的姓名：");
			String name = console.next();
			Student NewStudent = new Student(id, name);
			students.put(id, NewStudent);
			System.out.println("修改成功");
			break;
		}
	}
	
	public static void main(String[] args) {
		MapTest mp = new MapTest();
		mp.TestPut();
		mp.TestKeySet();
		mp.TestRemove();
		mp.TestEntrySet();
		mp.TestModify();
		mp.TestEntrySet();
	}

}

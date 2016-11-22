package com.voidking.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Course;
import com.voidking.hibernate.model.Student;

public class ManyToManySingle{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		// 创建事务对象
		Transaction ts=session.beginTransaction();

		//多对多单向关联
		Course cour1=new Course();
		Course cour2=new Course();
		Course cour3=new Course();
		cour1.setCnumber("101");
		cour1.setCname("计算机基础");
		cour2.setCnumber("102");
		cour2.setCname("数据库原理");
		cour3.setCnumber("103");
		cour3.setCname("计算机原理");
		Set courses=new HashSet();
		courses.add(cour1);
		courses.add(cour2);
		courses.add(cour3);
		Student stu=new Student();
		stu.setSnumber("081101");
		stu.setSname("李方方");
		stu.setSage(21);
		stu.setCourses(courses);
		session.save(stu);

		ts.commit();
		
		session.close();
		sf.close();
	}
}

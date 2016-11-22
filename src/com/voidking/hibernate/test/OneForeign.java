package com.voidking.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Person;
import com.voidking.hibernate.model.Room;

public class OneForeign{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		// 创建事务对象
		Transaction ts=session.beginTransaction();

		//唯一外键方式
		Person person=new Person();
		person.setName("liumin");
		Room room=new Room();
		room.setAddress("NJ-S1-328");
		person.setRoom(room);
		session.save(person);
		
		ts.commit();
		
		session.close();
		sf.close();
	}
}

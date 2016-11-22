package com.voidking.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Person;
import com.voidking.hibernate.model.Room;

public class ManyToOne{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		// 创建事务对象
		Transaction ts=session.beginTransaction();

		Room room=new Room();
		room.setAddress("NJ-S1-328");
		Person person=new Person();
		person.setName("liumin");
		
		person.setRoom(room);
		session.save(person);
		
		ts.commit();
		
		session.close();
		sf.close();
	}
}

package com.voidking.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Person;
import com.voidking.hibernate.model.Room;

public class OneToMany{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		// 创建事务对象
		Transaction ts=session.beginTransaction();

		Person person1=new Person(); 
		Person person2=new Person();
		Room room=new Room();
		room.setAddress("NJ-S1-328");
		person1.setName("李方方");
		person2.setName("王艳");
		person1.setRoom(room);
		person2.setRoom(room);
		//这样完成后就可以通过Session对象
		//调用session.save(person1)和session.save(person)
		//会自动保存room
		session.save(person1);
		session.save(person2);
		
		ts.commit();
		
		session.close();
		sf.close();
	}
}

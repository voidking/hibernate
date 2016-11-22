package com.voidking.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Detail;
import com.voidking.hibernate.model.Login;

public class SharePrimaryKey{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		// 创建事务对象
		Transaction ts=session.beginTransaction();
		//共享主键方式
		Detail detail=new Detail();
		Login login=new Login();
		login.setUsername("yanhong");
		login.setPassword("123");
		detail.setTruename("严红");
		detail.setEmail("yanhong@126.com");
		//相互设置关联
		login.setDetail(detail);
		detail.setLogin(login);
		//这样完成后就可以通过Session对象调用session.save(detail)来持久化该对象
		session.save(detail);
		
		ts.commit();
		
		session.close();
		sf.close();
	}
}

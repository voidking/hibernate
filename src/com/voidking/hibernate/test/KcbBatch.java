package com.voidking.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Kcb;

public class KcbBatch {
	public static void main(String[] args){
		//创建Session对象
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		//创建事务对象
		Transaction ts=session.beginTransaction();
		
		for (int i = 0; i < 500; i++) {
			Kcb kcb = new Kcb();
			kcb.setKch(i+"");
			session.save(kcb);
			if(i%50==0)
			{
				session.flush();
				session.clear();
			}
		}
		
		ts.commit();
		
		session.close();
		sf.close();
		
	}
}

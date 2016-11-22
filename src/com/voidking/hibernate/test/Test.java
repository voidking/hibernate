package com.voidking.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Kcb;

public class Test {
	public static void main(String[] args){
		//创建Session对象
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		//创建事务对象
		Transaction ts=session.beginTransaction();
		Kcb kc = new Kcb();
		kc.setKch("198");
		kc.setKcm("机电");
		kc.setKxxq(new Short((short) 5));
		kc.setXf(new Integer(5));
		kc.setXs(new Integer(59));
		
		//保存对象
		session.save(kc);
		ts.commit();
		Query query = session.createQuery("from Kcb where kch=198");
		List list = query.list();
		Kcb kcl=(Kcb)list.get(0);
		System.out.println(kcl.getKcm());
		session.close();
		sf.close();
		
	}
}

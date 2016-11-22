package com.voidking.hibernate.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.voidking.hibernate.model.Kcb;

public class KcbBatch2 {
	public static void main(String[] args){
		//创建Session对象
		Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		//创建事务对象
		Transaction ts=session.beginTransaction();
		
		Connection conn = session.connection();
		
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into kcb(kch) values(?)");
			for(int i=0;i<500;i++)
			{
				stmt.setString(1, i+"");
				stmt.addBatch();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ts.commit();
		
		session.close();
		sf.close();
		
	}
}

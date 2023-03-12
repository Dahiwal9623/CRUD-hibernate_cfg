package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddFriend {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure().addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Friend f = new Friend("Akash", "AK", "Kolhapur", "111111");
		
		s.save(f);
		t.commit();
		s.close();
		System.out.println("Friends Saved!");
	}
}
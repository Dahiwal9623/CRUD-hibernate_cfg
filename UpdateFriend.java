package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateFriend {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure().addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Friend obj = (Friend) s.get(Friend.class, 1);
		obj.setAddress("Pune");
		obj.setPhone("1234567890");
		
		s.update(obj);
		t.commit();
		s.close();
		System.out.println("Friend Updated!");
	}
}
package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteFriend {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure().addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Friend obj = (Friend) s.get(Friend.class, 3);
		s.delete(obj);
		t.commit();
		s.close();
		System.out.println("Friend Deleted!");
	}
}
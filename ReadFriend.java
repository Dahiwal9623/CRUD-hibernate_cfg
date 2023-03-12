package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadFriend {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure().addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Friend obj = (Friend) s.load(Friend.class, 5);
		System.out.println(obj);
	}
}
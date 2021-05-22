package com.ecodation.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ecodation.entity.SocialMediaEntity;

// singleton design pattern
public class HibernateUtils {
	
	private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();
	
	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
			// class
			configuration.addAnnotatedClass(SocialMediaEntity.class);
			
			SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			
			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
}

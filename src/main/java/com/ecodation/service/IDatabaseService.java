package com.ecodation.service;

import java.util.ArrayList;

import org.hibernate.Session;

import com.ecodation.util.HibernateUtils;

public interface IDatabaseService<T> {
	public void getCreate(T t);
	
	public void getDelete(int id);
	
	public void getUpdate(int id, T t);
	
	default T getSingleResult(int id) {
		return null;
	}
	
	default ArrayList<T> getMultipleResult() {
		return null;
	}
	
	default Session sessionDatabaseConnection() {
		return HibernateUtils.getSessionFactory().openSession();
	}
}

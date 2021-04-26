package com.hamit.controller;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.entity.Register;
import com.hamit.interfaces.IDatabaseCrud;

@Named(value = "studentController")
@SessionScoped
public class StudentController implements Serializable, IDatabaseCrud<Register> {
	private static final long serialVersionUID = 7474458432839836833L;

	@Override
	public void create(Register studentEntity) {
		Session session = databaseConnectionHibernate();
		session.getTransaction().begin();
		session.persist(studentEntity);
		session.getTransaction().commit();
		System.out.println("Ekleme başarılı");

	}

	@Override
	public void delete(Long id) {
		Register studentEntity2 = find(id);
		Session session = databaseConnectionHibernate();
		session.getTransaction().begin();
		session.remove(studentEntity2);
		session.getTransaction().commit();
		System.out.println("Silme başarılı");
	}

	@Override
	public void update(Register studentEntity, Long id) {
		Register studentEntity2 = find(id);
		studentEntity2.setNameSurname(studentEntity.getNameSurname());
		studentEntity2.setEmailAddress(studentEntity.getEmailAddress());
		studentEntity2.setPassword(studentEntity.getPassword());

		Session session = databaseConnectionHibernate();
		session.getTransaction().begin();
		session.merge(studentEntity2);
		session.getTransaction().commit();
		System.out.println("Güncelleme başarılı");

	}

	@Override
	public Register find(Long id) {
		Session session = databaseConnectionHibernate();
		Register studentEntity2;
		try {
			studentEntity2 = session.find(Register.class, id);
			if (studentEntity2 != null) {
				System.out.println("Bulma başarılı");
				System.out.println(studentEntity2);
				return studentEntity2;
			} else {
				System.out.println("Aradığını kriterde veri bulunmadı");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Register singleResult(Long id) {
		Session session = databaseConnectionHibernate();
		String sql = "select takmaAd from StudentEntity as takmaAd where takmaAd.id=" + id;
		TypedQuery<Register> query = session.createQuery(sql, Register.class);
		Register singleResult = query.getSingleResult();
		System.out.println(singleResult);
		return singleResult;
	}

	@Override
	public Long singleResultAggregateCount() {
		Long number = 4L;
		String sql = "select count(*) from  StudentEntity as studentEntity where studentEntity.id>:key";
		Session session = databaseConnectionHibernate();
		TypedQuery<Long> typedQuery = session.createQuery(sql, Long.class);
		typedQuery.setParameter("key", number);
		Long count = (Long) typedQuery.getSingleResult();
		return count;
	}

	@Override
	public Long singleResultAggregateOther() {
		// Double number = 1;
		// sum , count , min , max , avg
		String sql = "select sum(studentEntity.id) from  StudentEntity as studentEntity";
		Session session = databaseConnectionHibernate();
		TypedQuery<Long> typedQuery = session.createQuery(sql, Long.class);
		// typedQuery.setParameter("key", number);
		Long count = (Long) typedQuery.getSingleResult();
		return count;
	}

	@Override
	public ArrayList<Register> list() {
		Session session = databaseConnectionHibernate();
		String sql = "select studentEntity from StudentEntity as studentEntity where studentEntity.id>:key";
		TypedQuery<Register> typedQuery = session.createQuery(sql, Register.class);
		Long id = 4L;
		typedQuery.setParameter("key", id);
		ArrayList<Register> arrayListEntity = (ArrayList<Register>) typedQuery.getResultList();
		return arrayListEntity;
	}

}

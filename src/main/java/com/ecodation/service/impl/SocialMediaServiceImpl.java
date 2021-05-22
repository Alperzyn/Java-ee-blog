package com.ecodation.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.ecodation.entity.SocialMediaEntity;
import com.ecodation.service.IDatabaseService;

import lombok.extern.java.Log;

//C.D.I
@Named(value = "socialMediaController")
@SessionScoped
@Log
public class SocialMediaServiceImpl implements Serializable, IDatabaseService<SocialMediaEntity> {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void getCreate(SocialMediaEntity socialMediaEntity) {
		try {
			Session session = sessionDatabaseConnection();
			session.getTransaction().begin();
			session.save(socialMediaEntity);
			session.getTransaction().commit();
			session.close();
			log.info(SocialMediaEntity.class + " Eklendi.");
		} catch (Exception e) {
			e.printStackTrace();
			log.warning("Hata: " + SocialMediaEntity.class + " eklenemedi");
		}
	}
	
	@Override
	public void getDelete(int id) {
		try {
			Session session = sessionDatabaseConnection();
			SocialMediaEntity find = session.load(SocialMediaEntity.class, id);
			session.getTransaction().begin();
			session.delete(find);
			session.getTransaction().commit();
			session.close();
			log.info(SocialMediaEntity.class + " silindi.");
		} catch (Exception e) {
			e.printStackTrace();
			log.warning("Hata: " + SocialMediaEntity.class + " silinemedi");
		}
	}
	
	@Override
	public void getUpdate(int id, SocialMediaEntity socialMediaEntity) {
		try {
			Session session = sessionDatabaseConnection();
			SocialMediaEntity find = session.load(SocialMediaEntity.class, id);
			session.getTransaction().begin();
			find.setSocialName(socialMediaEntity.getSocialName());
			session.saveOrUpdate(find);
			session.getTransaction().commit();
			session.close();
			log.info(SocialMediaEntity.class + " güncellendi.");
		} catch (Exception e) {
			e.printStackTrace();
			log.warning("Hata: " + SocialMediaEntity.class + " güncellenemedi");
		}
	}
	
	@Override
	public SocialMediaEntity getSingleResult(int id) {
		Session session = sessionDatabaseConnection();
		SocialMediaEntity find = session.load(SocialMediaEntity.class, id);
		if (find != null) {
			log.info(SocialMediaEntity.class + " tek sonuç getirildi.");
		}
		return find;
	}
	
	@Override
	public ArrayList<SocialMediaEntity> getMultipleResult() {
		Session session = sessionDatabaseConnection();
		String jpql = "select  soc  from  SocialMediaEntity as  soc ";
		TypedQuery<SocialMediaEntity> query = session.createQuery(jpql, SocialMediaEntity.class);
		ArrayList<SocialMediaEntity> list = (ArrayList<SocialMediaEntity>) query.getResultList();
		if (list != null) {
			log.info(SocialMediaEntity.class + " Listelendi.");
		}
		return list;
		
	}
	
	// Jpa
	// EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HamitMizrak");
	// EntityManager entityManager = entityManagerFactory.createEntityManager();
	// // create delete update Transaction
	// entityManager.getTransaction().begin();
	// entityManager.persist(entityManager);// ekleme
	// entityManager.find(null, entityManager);
	// entityManager.merge(entityManager);// update
	// entityManager.remove(entityManager); // silmek
	// entityManager.getTransaction().commit();
	// entityManager.close();
	
	public static void main(String[] args) {
		
		SocialMediaServiceImpl impl = new SocialMediaServiceImpl();
		
		// SocialMediaEntity entity = new SocialMediaEntity(0, "Facebook");
		// impl.create(entity);
		
		// impl.delete(1);
		
		// SocialMediaEntity entity2 = new SocialMediaEntity();
		// entity2.setSocialName("Deneme");
		// impl.update(1, entity2);
		
		// SocialMediaEntity entity3 = impl.getSingleResult(1);
		// System.out.println(entity3);
		
		List<SocialMediaEntity> entity4 = impl.getMultipleResult();
		for (SocialMediaEntity temp : entity4) {
			System.out.println(temp);
			
		}
		
	}
}

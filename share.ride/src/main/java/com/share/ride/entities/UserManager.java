package com.share.ride.entities;

import java.util.List;

import org.hibernate.Session;
import static com.share.ride.entities.HibernateUtil.*;

public class UserManager {

	public void persist(User user)
	{
		Session session = getAppSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}


	public User query(int userId)
	{
		User movie = null;
		Session session = getAppSessionFactory().openSession();
		session.beginTransaction();
		movie = (User)session.load(User.class, userId);
		session.getTransaction().commit();
		return movie;
	}
	
	public List<User> listAll()
	{
		List<User> list = null;
		Session session = getAppSessionFactory().openSession();
		session.beginTransaction();
		list = session.createQuery("from User").list();
		session.getTransaction().commit();		
		return list;
	}


}
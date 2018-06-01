package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.UserVO;;

public class UserDAO {

	public void insertUser(UserVO uservo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(uservo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List loginSearch(UserVO userVO)
	{
			List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			Query q= session.createQuery("from UserVO where userEmail like '"+userVO.getEmail()+"' and userPswd like '"+userVO.getPswd()+"'");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;

	}
	
	
	public List headerSearch(UserVO userVO)
	{
			List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			Query q= session.createQuery("from UserVO where email = '"+userVO.getEmail()+"'");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;

	}
	
}

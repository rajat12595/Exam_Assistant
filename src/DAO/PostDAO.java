package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.PostVO;
import VO.PostVO;

public class PostDAO {

	public void insertPost(PostVO postVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(postVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	}
	
	
	
	public List SearchPost()
	{
		
		List ls=new ArrayList();
		try {
			
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Query is about to fire");
			Query q = session.createQuery("from PostVO");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
		
	}
	
	public void DeletePost(PostVO postvo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(postvo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void updatePost(PostVO postvo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(postvo);
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List EditPost(PostVO postVO)
	{
		
		List ls=new ArrayList();
		try {
			
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Query is about to fire");
			Query q = session.createQuery("from PostVO where postId="+postVO.getPostId()+"");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
		
	}
	
	
}

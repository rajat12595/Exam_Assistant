package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.ExamVO;
import VO.WagesVO;

public class WagesDAO {

	public void insertWages(WagesVO wagesVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(wagesVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DeleteWages(WagesVO wagesVO )
	{
		
		
		try {
			System.out.println("deletedao");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(wagesVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UpdateWages(WagesVO wagesVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(wagesVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List SearchWages( )
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from WagesVO");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	public List EditWages(WagesVO wagesVO )
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from WagesVO where wagesId="+wagesVO.getWagesId()+"");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
}

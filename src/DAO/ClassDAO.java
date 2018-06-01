package DAO;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Utility.HibernateUtil;
import VO.ClassVo;

public class ClassDAO {

	public void insertClass(ClassVo classVo )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(classVo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public List SearchClass( )
	{
		List ls=new ArrayList();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q=session.createQuery("From ClassVo");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	
	
	public void DeleteClass(ClassVo classVo )
	{
		
		
		try {
			System.out.println("deletedao");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(classVo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public List EditClass(ClassVo classVo)
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from ClassVo where classId="+classVo.getClassId()+"");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
}

package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Utility.HibernateUtil;
import VO.ClassBlockVO;

public class ClassBlockDAO {

	public void insertClassBlock(ClassBlockVO classBlockVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(classBlockVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public List SearchClassBlock( )
	{
		List ls=new ArrayList();
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q=session.createQuery("From ClassBlockVO");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	public List searchForChart( )
	{
		List ls=new ArrayList();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q=session.createQuery("select classVo.classNumber,count(classBlockId) From ClassBlockVO group by classVo.classId");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	

	public void updateClassBlock(ClassBlockVO classBlockVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(classBlockVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DeleteClassBlock(ClassBlockVO classBlockVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(classBlockVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public List EditClassBlock(ClassBlockVO blockVO )
	{
		List ls=new ArrayList();
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q=session.createQuery("From ClassBlockVO where classBlockId="+blockVO.getClassBlockId()+"");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
}

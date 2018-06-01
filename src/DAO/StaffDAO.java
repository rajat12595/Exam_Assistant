package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.StaffVO;
import VO.StaffVO;

public class StaffDAO {

	public void insertStaff(StaffVO staffVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(staffVO);
			
			tr.commit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void DeleteStaff(StaffVO staffVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(staffVO);
			
			tr.commit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStaff(StaffVO staffVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(staffVO);
			
			tr.commit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public List SearchStaff( )
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from StaffVO");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	
	
	
	
	public List EditStaff(StaffVO staffVO )
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from StaffVO where staffId="+staffVO.getStaffId()+"");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

}	

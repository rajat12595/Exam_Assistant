package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.FacultyVO;
import VO.FacultyVO;

public class FacultyDAO {

	public List SearchFaculty() {
		// TODO Auto-generated method stub
		
		List ls=new ArrayList();
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("From FacultyVO");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	
	public void DeleteFaculty(FacultyVO facultyVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(facultyVO);
			
			tr.commit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void insertFaculty(FacultyVO facultyVO) {
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(facultyVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}

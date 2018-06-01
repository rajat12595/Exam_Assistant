package DAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;








import VO.BranchVO;
import VO.ClassVo;
import VO.SemesterVO;

public class SemesterDAO implements Serializable {

	public void insertSemester(SemesterVO semvo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(semvo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void DeleteSemester(SemesterVO semvo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(semvo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void updateSemester(SemesterVO semvo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(semvo);
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List EditSemester(SemesterVO semesterVO)
	{
		
		List ls=new ArrayList();
		try {
			
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Query is about to fire");
			Query q = session.createQuery("from SemesterVO where semId="+semesterVO.getSemId()+"");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
		
	}
	public List SearchSemester()
	{
		
		List ls=new ArrayList();
		try {
			
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Query is about to fire");
			Query q = session.createQuery("from SemesterVO");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
		
	}
}

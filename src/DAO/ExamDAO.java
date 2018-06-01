package DAO;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.BranchVO;
import VO.ExamVO;

public class ExamDAO{

	public void insertExam(ExamVO examVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(examVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List SearchExam( )
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from ExamVO");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	public void updateExam(ExamVO examVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(examVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List EditExam(ExamVO examVO )
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("query is about to fire");
			Query q=session.createQuery("from ExamVO where examId="+examVO.getExamId()+"");
			ls=q.list();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	
	
	
	
	
	public void DeleteExam(ExamVO examVO )
	{
		
		
		try {
			System.out.println("deletedao");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(examVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List LoadSemester(BranchVO branchVO) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from SemesterVO where branchId="+branchVO.getBranchId());
			list = query.list();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return list;
	}
}

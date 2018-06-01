package DAO;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




import VO.BranchVO;

public class BranchDAO {

	public void insertBranch(BranchVO branchVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(branchVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteBranch(BranchVO branchVO)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.delete(branchVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void updateBranch(BranchVO branchVO )
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.saveOrUpdate(branchVO);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List editBranch(BranchVO branchVO)
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			Query q= session.createQuery("from BranchVO where branchId ="+branchVO.getBranchId()+"");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	
	
	public List searchBranch()
	{
		List ls=new ArrayList();
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			Query q= session.createQuery("from BranchVO");
			ls=q.list();
			
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	
}

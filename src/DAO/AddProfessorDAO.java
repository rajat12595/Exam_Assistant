package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.AddProfessorVO;


public class AddProfessorDAO {

		public void insertAddProfessor(AddProfessorVO addProfessorVO )
		{
			try {
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.save(addProfessorVO);
				
				tr.commit();
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		public void DeleteAddProfessor(AddProfessorVO addProfessorVO )
		{
			try {
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.delete(addProfessorVO);
				
				tr.commit();
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void updateAddProfessor(AddProfessorVO addProfessorVO )
		{
			try {
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				
				session.saveOrUpdate(addProfessorVO);
				
				tr.commit();
				} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		public List SearchProfessor( )
		{
			List ls=new ArrayList();
			
			try {
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				System.out.println("query is about to fire");
				Query q=session.createQuery("from AddProfessorVO");
				ls=q.list();
				tr.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ls;
		}
		
		
		
		
		
		public List EditAddProfessor(AddProfessorVO addProfessorVO )
		{
			List ls=new ArrayList();
			
			try {
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				System.out.println("query is about to fire");
				Query q=session.createQuery("from AddProfessorVO where addProfessorId="+addProfessorVO.getAddProfessorId()+"");
				ls=q.list();
				tr.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ls;
		}

}

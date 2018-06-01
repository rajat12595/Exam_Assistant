package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.LoginVO;

public class LoginDAO {

	public void insertUser(LoginVO loginvo)
	{
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			session.save(loginvo);
			
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List authentication(LoginVO loginVO) {
		// TODO Auto-generated method stub
		List ls=null;
		try{
			
			Session session = null;
			SessionFactory sessionfactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionfactory.openSession();
		
			
			Query  q =  session.createQuery("from LoginVO where username='"+loginVO.getUsername()+"' and password='"+loginVO.getPassword()+"' "); 
			
			
			ls =  q.list();
			System.out.println(ls.size());
			System.out.println("Done");
		} catch (Exception e) 
		{
			e.printStackTrace();

		}
		return ls;
	}
	}



package com.daohibernateconnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.practice.Test;
import com.springframeworrk.Test1;
import com.springs.DaoLogin;

@Repository
public class DaoHibernateLogin implements DaoLogin {
	
	final static Logger logger = Logger.getLogger(DaoHibernateLogin.class);

	public List<Test1> getTest1ByUserNameAndpwd(String username, String password) {
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();
		logger.debug("Session factory opened!!");
		Session session = sf.openSession();
		logger.debug("opened a session!!");
        Query q = session.createQuery("from Test1 where mail=:gb and pwd=:cd");//Test1-POJO class name and mail,pwd-POJO objct names
		q.setParameter("gb", username);
		q.setParameter("cd", password);
		List list = q.list();

		
		return list;
	}

	public List<Test1> getAllUsers() {
		logger.info("Entered into getAllUsers ::DaoHibernateLogin");
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Query queryAllUsers=session.createQuery("from Test1");
		List<Test1> userList=queryAllUsers.list();
		session.close();
		logger.info("Entered into getAllUsers ::DaoHibernateLogin");
		return userList;
	}
}

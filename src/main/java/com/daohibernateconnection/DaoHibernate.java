package com.daohibernateconnection;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.springframeworrk.Test1;
import com.springs.DaoObj;

@Repository
public class DaoHibernate implements DaoObj{
	final static Logger logger=Logger.getLogger(DaoHibernate.class);
	public void saveUser(Test1 test){
		logger.info("entered into hibernate connection");
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();
		logger.debug("Session factory opened!!");
		Session session = sf.openSession();
		logger.debug("opened a session!!");
		session.save(test);
		logger.debug("parsed user object to database");
		session.beginTransaction().commit();
		session.close();
		logger.info("exit into hibernate connection");

		System.out.println("printing");

		System.out.println("printed");
		

				
	}
}

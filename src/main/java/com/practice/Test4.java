package com.practice;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.daohibernateconnection.DaoJdbcLogin;
import com.springframeworrk.Test1;

@Controller
public class Test4 {
	
	final static Logger logger = Logger.getLogger(Test.class);


	@RequestMapping(value="/deleteTest1", method=RequestMethod.POST)
	public String deleteTest1Information(@RequestParam("mailToDelete") String mail, Model model) {
		logger.info("Entered into deleteTest1");
		logger.debug("deleteUser triggered!!" + mail);
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		logger.debug("Session factory opened!!");
		Session session = sf.openSession();
		logger.debug("opened a session!!");
		Query query = session.createQuery("delete from Test1 where mail = :mailid");
		query.setParameter("mailid", mail);
		query.executeUpdate();
		
		session.beginTransaction().commit();
	

		//Fetching updated user records from database and setting it into model object
		Query queryAllUsers = session.createQuery("from Test1");
		List<Test1> userList = queryAllUsers.list();
		model.addAttribute("uList", userList);
		
		session.close();
		logger.info("Exit into deleteTest1");
		return "Profile";
	}
	
	@RequestMapping(value="/editTest1", method=RequestMethod.POST)
	public String editTest1Information(@RequestParam("mailToEdit") String mail, Model model) {
		logger.info("Entered into editTest1");
		logger.debug("editUser triggered!!" + mail);
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		logger.debug("Session factory opened!!");
		Session session = sf.openSession();
		logger.debug("opened a session!!");

		
		Query query = session.createQuery("from Test1 where mail = :mailid");
		query.setParameter("mailid", mail);
		List<Test1> testlist = query.list();
		model.addAttribute("testObj", testlist.get(0));
		logger.info("Exit into editTest1");
		return "editList";
	}
	
	@RequestMapping(value = "/updateTest")
	public String updateUserDetails(Test1 t, Model model) {
		
		logger.info("Entered into updateTest1");

		
		logger.debug("updateUserDetails method triggered!!");
		logger.debug(t.getNam());
		logger.debug(t.getUsrnam());
		logger.debug(t.getMbl());
		logger.debug(t.getMail());
		logger.debug(t.getPwd());


		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		logger.debug("Session factory opened!!");
		Session session = sf.openSession();
		logger.debug("opened a session!!");
try{
		session.update(t);
		session.beginTransaction().commit();
}catch(StaleObjectStateException ex){
	model.addAttribute("errormessage","The record has been modified by other user, kinldy take the latest and update");
	return "editList";
}catch(Exception e){
	e.printStackTrace();
}
		Query queryAllUsers = session.createQuery("from Test1");
		List<Test1> userList = queryAllUsers.list();
		model.addAttribute("uList", userList);
		

		session.close();
		
		logger.info("Exit into updateTest1");

		return "Profile";
		
	

	
}
	@RequestMapping(value="/fetchAllRecords*")
	public String getAllRecords(Model model){
		DaoJdbcLogin dn=new DaoJdbcLogin();
List<Test1> allUsers=dn.getAllUsers();
model.addAttribute("uList",allUsers);
return "Profile";
		
	}

}
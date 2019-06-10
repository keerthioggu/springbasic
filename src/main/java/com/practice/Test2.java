package com.practice;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springframeworrk.Test1;
import com.springs.DaoLogin;

@Controller
public class Test2 {
	
	@Autowired
	DaoLogin dl;

	final static Logger logger = Logger.getLogger(Test.class);

	@RequestMapping(value = "/loginuser")
	public String details(@RequestParam("userName") String username, @RequestParam("pwd") String password,
			Model model) {
		logger.info("Entered into loginuser");
		logger.debug("hello");

		/*Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();
		logger.debug("Session factory opened!!");
		Session session = sf.openSession();
		logger.debug("opened a session!!");
        Query q = session.createQuery("from Test1 where mail=:gb and pwd=:cd");//Test1-POJO class name and mail,pwd-POJO objct names
		q.setParameter("gb", username);
		q.setParameter("cd", password);
		List list = q.list();*/
		List<Test1> list =dl.getTest1ByUserNameAndpwd(username, password);
		if (list.isEmpty()) {

			logger.debug("Invalid credentials!! stop login page");

			model.addAttribute("msg", "Invalid Credentials entered!! Please check your credentials!!");

			return "Login";

		} else {
			logger.debug("Valid Credentials entered!!login success forward to profile page");
			//need to read all Test1 details and send those to profile.jsp page
			/*Query queryAllUsers=session.createQuery("from Test1");
			List<Test1> userList=queryAllUsers.list();*/
			List<Test1> userList=dl.getAllUsers();
		/*	for(Test1 test:userList) {
				System.out.println(test.getNam());
				System.out.println(test.getUsrnam());
				System.out.println(test.getMbl());
				System.out.println(test.getMail());
				System.out.println(test.getPwd());
			}
			
			model.addAttribute("uList",userList);
			model.addAttribute("Key1","keerthi go to office!!");
			logger.info("Exit into loginuser");*/
			return "Success";
		}




	}
	
}

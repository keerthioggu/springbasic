package com.practice;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.Test3;
import com.springframeworrk.Employee;
import com.springframeworrk.Passport;
import com.springframeworrk.Test1;
import com.springs.DaoObj;


@Controller
public class Test {

	final static Logger logger = Logger.getLogger(Test.class);
	
	@Autowired
	DaoObj d;

	//@Qualifier(value="jdaemp")
	@Autowired
	Employee e1;

	//@Qualifier(value="jdaemp")
	@Autowired
	Employee e2;
	
	//@Qualifier(value="ctsemployee")
	@Autowired
	Employee e3;
	
	//@Qualifier(value="ctsemployee")
	@Autowired
	Employee e4;

	@RequestMapping(value = "/testing")
	public String testIoc() {
		logger.info("entered testIoc");
		System.out.println("entered testIoc");

		System.out.println("---------------------------------");
		System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getEmpCity() + " " + e1.getEmpCompany()
				+ " " + e1.getPport().getPid() + " " + e1.getPport().getIssuedCity() + " " + e1.getPport().getName()
				+ " " + e1.getPport().getAdd().getCity() + " " + e1.getPport().getAdd().getPin());
		System.out.println(e2.getEmpId() + " " + e2.getEmpName() + " " + e2.getEmpCity() + " " + e2.getEmpCompany()
				+ " " + e2.getPport().getPid() + " " + e2.getPport().getIssuedCity() + " " + e2.getPport().getName()
				+ " " + e2.getPport().getAdd().getCity() + " " + e2.getPport().getAdd().getPin());
		System.out.println(e3.getEmpId() + " " + e3.getEmpName() + " " + e3.getEmpCity() + " " + e3.getEmpCompany()
				+ " " + e3.getPport().getPid() + " " + e3.getPport().getIssuedCity() + " " + e3.getPport().getName()
				+ " " + e3.getPport().getAdd().getCity() + " " + e3.getPport().getAdd().getPin());
		
		System.out.println(e4.getEmpId() + " " + e4.getEmpName() + " " + e4.getEmpCity() + " " + e4.getEmpCompany()
		+ " " + e4.getPport().getPid() + " " + e4.getPport().getIssuedCity() + " " + e4.getPport().getName()
		+ " " + e4.getPport().getAdd().getCity() + " " + e4.getPport().getAdd().getPin());
		
		System.out.println("---------------------------------");
                                                                                   
	    e1.setEmpId(121);
		e1.setEmpName("shikardhawan");
		e1.getPport().setPid(14778);
		e1.getPport().setIssuedCity("karnataka");
		e1.getPport().setName("ok");
		e1.getPport().getAdd().setCity("chennai");
		e1.getPport().getAdd().setPin("505301");
		
		
		
		

		
	    System.out.println("---------------------------------");

		System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getEmpCity() + " " + e1.getEmpCompany()
				+ " " + e1.getPport().getPid() + " " + e1.getPport().getIssuedCity() + " " + e1.getPport().getName()
				+ " " + e1.getPport().getAdd().getCity() + " " + e1.getPport().getAdd().getPin());
		System.out.println(e2.getEmpId() + " " + e2.getEmpName() + " " + e2.getEmpCity() + " " + e2.getEmpCompany()
				+ " " + e2.getPport().getPid() + " " + e2.getPport().getIssuedCity() + " " + e2.getPport().getName()
				+ " " + e2.getPport().getAdd().getCity() + " " + e2.getPport().getAdd().getPin());
		System.out.println(e3.getEmpId() + " " + e3.getEmpName() + " " + e3.getEmpCity() + " " + e3.getEmpCompany()
				+ " " + e3.getPport().getPid() + " " + e3.getPport().getIssuedCity() + " " + e3.getPport().getName()
				+ " " + e3.getPport().getAdd().getCity() + " " + e3.getPport().getAdd().getPin());

		System.out.println(e4.getEmpId() + " " + e4.getEmpName() + " " + e4.getEmpCity() + " " + e4.getEmpCompany()
		+ " " + e4.getPport().getPid() + " " + e4.getPport().getIssuedCity() + " " + e4.getPport().getName()
		+ " " + e4.getPport().getAdd().getCity() + " " + e4.getPport().getAdd().getPin());
		
		System.out.println("---------------------------------");

		e2.setEmpId(125);
		e2.setEmpName("gali");
		e2.getPport().setPid(146587);
		e2.getPport().setIssuedCity("kolkata");
		e2.getPport().setName("suni");
		e2.getPport().getAdd().setCity("chintal");
		e2.getPport().getAdd().setPin("505305");

		System.out.println("---------------------------------");

		System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getEmpCity() + " " + e1.getEmpCompany()
				+ " " + e1.getPport().getPid() + " " + e1.getPport().getIssuedCity() + " " + e1.getPport().getName()
				+ " " + e1.getPport().getAdd().getCity() + " " + e1.getPport().getAdd().getPin());
		System.out.println(e2.getEmpId() + " " + e2.getEmpName() + " " + e2.getEmpCity() + " " + e2.getEmpCompany()
				+ " " + e2.getPport().getPid() + " " + e2.getPport().getIssuedCity() + " " + e2.getPport().getName()
				+ " " + e2.getPport().getAdd().getCity() + " " + e2.getPport().getAdd().getPin());
		System.out.println(e3.getEmpId() + " " + e3.getEmpName() + " " + e3.getEmpCity() + " " + e3.getEmpCompany()
				+ " " + e3.getPport().getPid() + " " + e3.getPport().getIssuedCity() + " " + e3.getPport().getName()
				+ " " + e3.getPport().getAdd().getCity() + " " + e3.getPport().getAdd().getPin());

		System.out.println(e4.getEmpId() + " " + e4.getEmpName() + " " + e4.getEmpCity() + " " + e4.getEmpCompany()
		+ " " + e4.getPport().getPid() + " " + e4.getPport().getIssuedCity() + " " + e4.getPport().getName()
		+ " " + e4.getPport().getAdd().getCity() + " " + e4.getPport().getAdd().getPin());
		
		e3.setEmpId(127);
		e3.setEmpName("malinga");
		e3.getPport().setPid(15748);
		e3.getPport().setIssuedCity("maharashtra");
		e3.getPport().setName("sunitha");
		e1.getPport().getAdd().setCity("manchiryala");
		e1.getPport().getAdd().setPin("505307");

		System.out.println("---------------------------------");

		System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getEmpCity() + " " + e1.getEmpCompany()
				+ " " + e1.getPport().getPid() + " " + e1.getPport().getIssuedCity() + " " + e1.getPport().getName()
				+ " " + e1.getPport().getAdd().getCity() + " " + e1.getPport().getAdd().getPin());
		System.out.println(e2.getEmpId() + " " + e2.getEmpName() + " " + e2.getEmpCity() + " " + e2.getEmpCompany()
				+ " " + e2.getPport().getPid() + " " + e2.getPport().getIssuedCity() + " " + e2.getPport().getName()
				+ " " + e2.getPport().getAdd().getCity() + " " + e2.getPport().getAdd().getPin());
		System.out.println(e3.getEmpId() + " " + e3.getEmpName() + " " + e3.getEmpCity() + " " + e3.getEmpCompany()
				+ " " + e3.getPport().getPid() + " " + e3.getPport().getIssuedCity() + " " + e3.getPport().getName()
				+ " " + e3.getPport().getAdd().getCity() + " " + e3.getPport().getAdd().getPin());

		System.out.println(e4.getEmpId() + " " + e4.getEmpName() + " " + e4.getEmpCity() + " " + e4.getEmpCompany()
		+ " " + e4.getPport().getPid() + " " + e4.getPport().getIssuedCity() + " " + e4.getPport().getName()
		+ " " + e4.getPport().getAdd().getCity() + " " + e4.getPport().getAdd().getPin());
		
		System.out.println("----------------------------------");

		System.out.println("exit testIoc");
		logger.info("exit testIoc");
		return "Register";

	}

	@RequestMapping(value = "/application")
	public String details(Test1 test, Model model) throws Exception {
		logger.info("Entered into application");
		/* try { */
		// mobile number start validation
		boolean isValidMobile = Test3.isValidNum(test.getMbl());
		if (!isValidMobile) {
			logger.debug("Entered invalid mobile details!! " + test.getMbl());
			model.addAttribute("errormessege", "Entered Invalid mobile number!! Please try with valid mobile number");
			return "Register";
		}
		logger.debug("Entered valid mobile details!! " + test.getMbl());
		// mobile number end validation

		// gmail validation start

		boolean isValidMailid = Test3.isValidMail(test.getMail());
		if (!isValidMailid) {
			logger.debug("Entered invalid mail id!! " + test.getMail());
			model.addAttribute("errormessege", "Entered Invalid mailid!! Please try with valid mailid");
			return "Register";

		}
		logger.debug("Entered valid mail id!! " + test.getMail());
		// gmail validation end

		// password validation starts here

		boolean isValidPword = Test3.isValidPwd(test.getPwd());
		if (!isValidPword) {
			logger.debug("Entered invalid password!! " + test.getPwd());
			model.addAttribute("errormessege", "Entered Invalid password!! Please try with valid password");
			return "Register";
		}
		logger.debug("Entered valid password!! " + test.getPwd());
		// password validation ends here
		logger.debug("Validation successfully completed!! Data entered by user is perfectly valid!!");
		d.saveUser(test);
		/*
		 * Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		 * SessionFactory sf = configure.buildSessionFactory();
		 * logger.debug("Session factory opened!!"); /* String s=null; s.length();
		 */
		/*
		 * Session session = sf.openSession(); logger.debug("opened a session!!");
		 * session.save(test); logger.debug("parsed user object to database");
		 * session.beginTransaction().commit(); session.close();
		 */
		/*
		 * }catch(Exception e) { logger.error("Exception occured!!", e);
		 * model.addAttribute("errormessege",
		 * "Something went wrong with registration!!"); return "Register"; }
		 */
		logger.debug("Request came for : " + test.getNam() + " " + test.getUsrnam() + " " + test.getMbl() + " "
				+ test.getMail() + " " + test.getPwd());
		logger.info("Exiting from application");
		return "Login";
	}

}

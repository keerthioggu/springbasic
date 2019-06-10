package com.daohibernateconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.springframeworrk.Test1;
import com.springs.DaoLogin;

public class DaoJdbcLogin implements DaoLogin {
	
	public static final Logger logger=Logger.getLogger(DaoJdbcLogin.class);

	public List<Test1> getTest1ByUserNameAndpwd(String username, String password) {
		logger.info("Entered into getUserByUserNameAndPassword ::DaoJdbcLogin");
		List<Test1> list = new ArrayList<Test1>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeee", "root", "keethu");

			PreparedStatement preparedStatement = con.prepareStatement("select * from employeee.emp1 where mail = ? and pwd = ?");

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			// execute insert SQL stetement
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {              
				Test1 test = new Test1();
				
				test.setNam(rs.getString("nam"));
				test.setUsrnam(rs.getString("usrnam"));
				test.setMbl(rs.getString("mbl"));
				test.setMail(rs.getString("mail"));
				test.setPwd(rs.getString("pwd"));
			    list.add(test);
			}
			
		} catch(Exception e) {
			logger.error("Exception occured while fetching user data based on userName and password", e);
		}
		logger.info("Exit from getUserByUserNameAndPassword ::DaoJdbcLogin");
		

		return list;
	}

	public List<Test1> getAllUsers() {
		logger.info("Entered into getAllUsers ::DaoJdbcLogin");
		List<Test1> list = new ArrayList<Test1>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeee", "root", "keethu");
			PreparedStatement preparedStatement = con.prepareStatement("select *from employeee.emp1");
			// execute insert SQL stetement
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {              
				Test1 test = new Test1();
				test.setNam(rs.getString("nam"));
				test.setUsrnam(rs.getString("usrnam"));
				test.setMbl(rs.getString("mbl"));
				test.setMail(rs.getString("mail"));
				test.setPwd(rs.getString("pwd"));

			    list.add(test);
			}
			
		} catch(Exception e) {
			logger.error("Exception occured while fetching user data based on userName and password", e);
		}
		logger.info("Exit from getAllUsers ::DaoJdbcLogin");
		
		return list;
	}

}

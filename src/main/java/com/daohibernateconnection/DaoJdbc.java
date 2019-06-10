package com.daohibernateconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.springframeworrk.Test1;
import com.springs.DaoObj;

public class DaoJdbc implements DaoObj {
	final static Logger logger=Logger.getLogger(DaoJdbc.class);
	public void saveUser(Test1 test) throws Exception {
		logger.info("enter from saveUser:DaoJdbc");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeee","root","keethu");
		PreparedStatement preparedstatement=con.prepareStatement("insert into employeee.emp1(nam,usrnam,mbl,mail,pwd,roles) values (?,?,?,?,?,?)");
		preparedstatement.setString(1,test.getNam());
		preparedstatement.setString(2,test.getUsrnam());
		preparedstatement.setString(3,test.getMbl());
		preparedstatement.setString(4,test.getMail());
		preparedstatement.setString(5,test.getPwd());
		preparedstatement.setString(6,test.getRole());
		preparedstatement.executeUpdate();
		logger.debug("Record is inserted into test table! using jdbc");
		logger.info("exit from saveUser:DaoJdbc");

		System.out.println("commited");

		System.out.println("successfully");
		System.out.println("KEETHU");

	}

}

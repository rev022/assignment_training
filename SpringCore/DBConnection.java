package com.example.demo.impl;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.example.demo.DBInterface;


@Component
public class DBconnection implements DBInterface {
	
	Connection connection;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CaseStudyDB","root","admin@123");
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return connection;
	}
		public void closeConnection() {
			
			try {
				 if(connection!=null) {
					 connection.close();
				 }
			} catch (SQLException sqle) {
System.out.println(sqle);				}
		}
		

}

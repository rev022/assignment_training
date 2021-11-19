package com.example.demo.impl;

import com.example.demo.DBInterface;
import com.example.demo.UserValidationInterface;
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DefaultUserValidation implements UserValidationInterface{
	
	@Autowired
	private DBInterface DBConnection;

	@Override
	public boolean validateUser(String username, String password) {
		
		boolean f=false;
		try {
			PreparedStatement p1=(PreparedStatement) DBConnection.getConnection().prepareStatement("select uid from user where uname=? and password=?");
			p1.setString(1, username);
			p1.setString(2, password);
			ResultSet rs=p1.executeQuery();
			if (f==rs.next()) {
				f=true;
			}
	 	}
		catch(Exception e) {System.out.println();}
		return f;
	}
}


package com.example.demo;

import java.sql.Connection;

public interface DBInterface {
	
	public Connection getConnection();
	public void closeConnection();

}

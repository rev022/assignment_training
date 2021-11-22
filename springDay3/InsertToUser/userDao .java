package com.example.demo;

import java.util.List;

public interface userDao {
	
	public int save(Object object);
	public List<User> getData();
	public int update(Object object);
	public int delete(Object object);

}

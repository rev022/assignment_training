package com.sonata.Rest;

import java.util.List;


public interface TaskInterface {
	//public Task getTask(int id);
	public List<Task> getData();
	public int setPriority(int taskid, String pri);
	public List<Task> printTask(int t);
	public int addtask(Task u);
	public int addNotesBM(String notes, String isBookMarked, int taskid);

	
}

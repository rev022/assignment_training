package com.sonata.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	@Autowired
	TaskInterface task;
	//@GetMapping(value = "/task")

	@RequestMapping(value = "/task1", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getTask() {
		return  task.getData();	
	}
	
/*	@RequestMapping(value = "/task2", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public int setPriority() {
		return  task.setPriority(24);	
	}   */
	
	@RequestMapping(value ="/taskid/{taskid}/priority/{pri}",method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> printTask(@PathVariable int taskid, @PathVariable String pri, Model model) {
		model.addAttribute("pri", pri);
		model.addAttribute("taskid", taskid);
	int	row=task.setPriority(taskid,pri);
		return task.printTask(taskid);
	}	

	
	@PostMapping(value= "/addtask", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task t) throws Exception
	{
		task.addtask(t);
		return t;


	}
	
	}	

	



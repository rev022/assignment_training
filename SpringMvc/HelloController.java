package com.example.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
    public String sayHello(Model model) {             
        model.addAttribute("msg", "Hello Ganesh");       
        return "hello";
    }
	
	@RequestMapping("/NewFile")
	public ModelAndView login(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd, Model model) {
		ModelAndView mav = new ModelAndView("welcome");
		model.addAttribute("uname",uname);
		model.addAttribute("pwd",pwd);
		
		int f11=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudydb","root","admin@123");
			PreparedStatement p1=con.prepareStatement("select userid from user where username=? and pwd=?");
			p1.setString(1, uname);
			p1.setString(2, pwd);
			ResultSet rs=p1.executeQuery();
			if(rs.next()) {
				f11=1;
				return mav;
			}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return new ModelAndView("index");
	}
}
		

	
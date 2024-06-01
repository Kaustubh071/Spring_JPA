package com.example.day11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.day11.model.Student;
import com.example.day11.repository.repo;

@Controller
public class myController {
	
	@Autowired
	 repo r;
	
	@RequestMapping("/")
	String fun(Model m)
	{
		Student s = new Student();
		m.addAttribute("obj",s);
		
		return "reg.html";
	}
	
	@RequestMapping("/reg")
	@ResponseBody
	String fun1(@ModelAttribute Student s)
	{
		
		System.out.println("Data"+s);
		
		r.save(s);
		return "Data inserted";
	}

}

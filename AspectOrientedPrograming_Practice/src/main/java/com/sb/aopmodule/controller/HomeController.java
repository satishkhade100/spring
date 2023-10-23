package com.sb.aopmodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sb.aopmodule.model.Student;
import com.sb.aopmodule.serviceImpl.StudentServiceImpl;

@Controller
@ResponseBody
public class HomeController {

	@Autowired
	StudentServiceImpl impl;
	
	
	@GetMapping("/getdata")
	
	public ResponseEntity<List<Student>>getstudata()
	{
		System.out.println("Hello");
		System.out.println(10/0);
		List<Student>lis=impl.getStudentData();
		
		return new ResponseEntity<List<Student>>(lis, HttpStatus.OK);
	}
	
	
		
	
	
	
	
	
	
}

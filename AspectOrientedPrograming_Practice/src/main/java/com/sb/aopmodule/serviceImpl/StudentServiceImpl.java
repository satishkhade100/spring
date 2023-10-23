package com.sb.aopmodule.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.aopmodule.model.Student;
import com.sb.aopmodule.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{

	@Override
	public List<Student> getStudentData() {
	
		
		List<Student>list=new ArrayList<Student>();
		
		
		Student stu=new Student();
		stu.setId(1);
		stu.setName("Satish Khade");
		stu.setAddress("Satara");
		
		
		
		Student stu1=new Student();
		stu1.setId(2);
		stu1.setName("pravin Kusale");
		stu1.setAddress("Kop");
		
		list.add(stu);
		list.add(stu1);
		
		
		return list;
	}

}

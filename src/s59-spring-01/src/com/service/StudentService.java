package com.service;

import com.dao.StudentDAO;

public class StudentService {
	
	private StudentDAO studentDAO ;
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public void delStudent(){
		studentDAO.delStudent();
	}
	

}

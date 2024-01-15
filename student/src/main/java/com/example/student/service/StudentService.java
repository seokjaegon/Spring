package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.dto.studentDTO;

@Service
public class StudentService {

	public void save(studentDTO studentDTO) {
		System.out.println("StudentService.save()");
		System.out.println("StudentDTO = " + studentDTO);
		
	}

}

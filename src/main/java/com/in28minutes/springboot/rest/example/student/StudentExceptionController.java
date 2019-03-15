package com.in28minutes.springboot.rest.example.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionController {
	
	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<Object> exception(StudentNotFoundException exception) {
		return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = UploadBoundException.class)
	public ResponseEntity<Object> exceptionUpload(UploadBoundException exception) {
		return new ResponseEntity<>("Upload invalid", HttpStatus.NOT_ACCEPTABLE);
	}

}

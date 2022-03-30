package com.example.project1.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.project1.Project2Application;
import com.example.project1.dto.Project2Dto;
import com.example.project1.entity.Project2;

public interface IProject2Service {
	static final Logger logger = LoggerFactory.getLogger(Project2Application.class);
	  public default String ServiceLog() {
		logger.info("this is a user management entity file ");
		return "ServiceLog";
		}

	
	public List<Project2> getAll();
	
	public List<Project2> getCustomer();
	
  public Project2Dto save(Project2 customer);
	
	public Project2Dto delete(Integer id);
}

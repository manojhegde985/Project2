package com.example.project1.bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project1.Project2Application;
import com.example.project1.dto.Project2Dto;
import com.example.project1.eo.Project2;


public class Project2Bo {
	@Autowired
	private Project2 eo;
	
	
	private static final Logger logger = LoggerFactory.getLogger(Project2Application.class);
	public String ServiceLog() {
	logger.info("this is a user management entity file ");
	return "ServiceLog";
	}
	
	
	public List<Project2Dto> getAll() {

	logger.info("fetched data in EO by REST TEMPLATE");

	return eo.getAll();
	}


	public List<Project2Dto> getCustomer() {
		logger.info("fetched data in EO by FEIGN CLIENT");
		return eo.getCustomer();
	}
	
	public Project2Dto[] save() {
		return eo.save();
	}
	
	public Project2Dto[] delete() {
		return eo.delete();
	}
	
	
	
	

}

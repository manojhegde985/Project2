package com.example.project1.eo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project1.Project2Application;
import com.example.project1.dto.Project2Dto;
import com.example.project1.feignclient.FeignClient1;
import com.example.project1.resttemplate.RestTemplateClass;



public class Project2 {
	@Autowired
	private FeignClient1 feignClient1;
	
	@Autowired
	private RestTemplateClass restTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(Project2Application.class);
	public String ServiceLog() {
	logger.info("this is a user management entity file ");
	return "ServiceLog";
	}
	
	
	

	public List<Project2Dto> getAll() {

	logger.info("fetched data in EO by REST TEMPLATE");
	return restTemplate.getCustomers();
	}


	
	public List<Project2Dto> getCustomer() {
		
		 return feignClient1.getCustomer();
	}
	
	public Project2Dto[] save() {
		return restTemplate.save();
	}
	
	public Project2Dto[] delete() {
		return restTemplate.delete();
	}
	
	public Project2Dto[] savefeign() {
		return feignClient1.save();
	}
	
	public Project2Dto[] deletefeign() {
		return feignClient1.delete();
	}
	
	
}

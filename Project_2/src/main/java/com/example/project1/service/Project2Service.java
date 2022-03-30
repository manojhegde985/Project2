package com.example.project1.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.project1.Project2Application;
import com.example.project1.bo.Project2Bo;
import com.example.project1.dto.Project2Dto;
import com.example.project1.entity.Project2;
import com.example.project1.mapstruct.Mapstruct;



public class Project2Service {

	@Autowired
	private Project2Bo bo;
	@Autowired
	private Mapstruct mapstruct;

	private static final Logger logger = LoggerFactory.getLogger(Project2Application.class);

	public String ServiceLog() {
		logger.info("this is a service file ");

		return "ServiceLog";
	}

	

	public List<Project2> getAll() {
		return mapstruct.customerDtoToCustomerList(bo.getAll());
	}

	public List<Project2> getCustomer() {
		return mapstruct.customerDtoToCustomerList(bo.getCustomer());
	}
	
	public Project2Dto save() {
		return mapstruct.customerDtoToCustomerSave(bo.save());
	}
	
	public Project2 getUser() {
		return mapstruct.customerDtoToCustomerDelete(bo.delete());
	}
	
	
	
}

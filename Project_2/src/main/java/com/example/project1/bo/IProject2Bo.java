package com.example.project1.bo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.project1.Project2Application;
import com.example.project1.dto.Project2Dto;



public interface IProject2Bo {
	static final Logger logger = LoggerFactory.getLogger(Project2Application.class);
	  public default String ServiceLog() {
		logger.info("this is a user management entity file ");
		return "ServiceLog";
		}

	
	public List<Project2Dto> getAll();
	
	public List<Project2Dto> getUser();
	
    public Project2Dto save();
	
	public Project2Dto delete();
}

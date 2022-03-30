package com.example.project1.resttemplate;

 import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.project1.config.ConfigClass;
import com.example.project1.dto.Project2Dto;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;



@Component
public class RestTemplateClass {
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ConfigClass configclass;


	public List<Project2Dto> getCustomers()
	{
	Project2Dto[] objects = restTemplate.getForObject(configclass.getUrl(), Project2Dto[].class);
	return Arrays.asList(objects);
	}


	public Project2Dto[] save() {
		Project2Dto[] objects = restTemplate.getForObject(configclass.getUrl(), Project2Dto[].class);
		return objects;
	}


	public Project2Dto[] delete() {
		Project2Dto[] objects = restTemplate.getForObject(configclass.getUrl(), Project2Dto[].class);
		return objects;
	}
	
	
}
	



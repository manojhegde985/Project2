package com.example.project1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.project1.dto.Project2Dto;
import com.example.project1.entity.Project2;
import com.example.project1.service.IProject2Service;



@RestController
@RequestMapping(value = "/project2")
@EnableFeignClients
public class Project2Controller {
	@Autowired
	private IProject2Service service;
	
	private final Logger logger = LoggerFactory.getLogger(Project2Controller.class);
   
    String controller(){
       
        logger.info("This is a customer management controller layer");
        return "controller";
    }
    
    //Rest template
    @GetMapping("/getAllCustomer")
  
    public ResponseEntity<List<Project2>> getAll()
    {
    List<Project2> allUsers = service.getAll();
    logger.info("fetched data in controller by REST TEMPLATE");
    return new ResponseEntity<List<Project2>>(allUsers , HttpStatus.OK);

    }
     
    //Feign client
    @GetMapping("/getAll")
   
    public ResponseEntity<List<Project2>> getAllCustomers() {
    	 List<Project2> allUsers = service.getCustomer();
    	    logger.info("fetched data in controller by FEIGN CLIENT");
    	    return new ResponseEntity<List<Project2>>(allUsers , HttpStatus.OK);
    
    }
    
    @PostMapping("/restsave")
	public ResponseEntity<Project2Dto> savecustomer( @RequestBody Project2 customer)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(customer));
	}
	
	
	@DeleteMapping("/rest/{id}")
	public void delete(@PathVariable Integer id) {
		 service.delete(id);
	}
    
		
}

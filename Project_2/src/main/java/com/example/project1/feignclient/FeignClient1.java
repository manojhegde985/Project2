package com.example.project1.feignclient;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.project1.dto.Project2Dto;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;




@FeignClient(name="feign",url="http://localhost:8088/customer/")
public interface FeignClient1 {

@GetMapping("/getAll")
public List<Project2Dto> getCustomer();

@PostMapping("/save")
public Project2Dto[] save();

@GetMapping("/delete")
public Project2Dto[] delete();


}
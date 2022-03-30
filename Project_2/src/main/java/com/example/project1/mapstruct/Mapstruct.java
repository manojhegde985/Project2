package com.example.project1.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.project1.dto.Project2Dto;
import com.example.project1.entity.Project2;



@Mapper(componentModel="spring")
public interface Mapstruct {
	List<Project2> customerDtoToCustomerList(List<Project2Dto> list);

	Project2Dto customerDtoToCustomerSave(Project2Dto[] project2Dtos);
	
	Project2 customerDtoToCustomerDelete(Project2Dto[] delete);
}

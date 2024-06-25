package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Crewinfo;
import com.example.demo.resttemplateservice.ResttemplateService;

@RestController
public class ResttemplateGet {
	
	@Autowired
	private  ResttemplateService  resttemplateservice;
	
	@GetMapping("/getAllcrew/{id}")
	public ResponseEntity<Crewinfo> getEmpployeeById(@PathVariable int id){
		return resttemplateservice.getcrewById(id);
		
	}
	
	@GetMapping("/getAllcrew")
	public ResponseEntity<String> getAllEmpployee(){
		return resttemplateservice.allCrew();
		
	}
	
	
	
	
	
	

}

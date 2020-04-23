package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.LoanRequest;
import com.cg.service.LoanRequestService;


@CrossOrigin(origins="*")
@RestController

public class LoanController {
	
	  @Autowired
	  LoanRequestService loanrequestservice;
	  
	  @GetMapping(value="/loanrequest")
	  public List<LoanRequest> fetchLoanRequest()
	  {
		  return loanrequestservice.reterive();
	  }
	  
	  @GetMapping(value="/loanrequest/{id}")
	  public LoanRequest fetchone(@PathVariable String id)
	  {
		  return loanrequestservice.findbyId(id);
	  }
	  
	  @PostMapping(value="/loanrequest/new" ,consumes = {"application/json"})
	  public String addLoanRequest(@RequestBody LoanRequest loanrequest)
	  {
		  loanrequestservice.create(loanrequest);
		  return "loanrequest added";
	  }
	  
	  @DeleteMapping(value = "/loanrequest/delete/{id}")
	   public String deleteloanrequest(@PathVariable int id)
	  {
		  loanrequestservice.delete(id);
		  return "loanrequest deleted";
	  }
	}


	//get--> get/loanrequest   reterive data loanrequest (ie all student)
	//get-->get/loanrequest/1--->reterive one loanrequest
	//post-->add data new loanrequest
	//put-->update the loanrequest
	//delete-->delete the loanrequest



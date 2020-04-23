package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.LoanRequest;

@Service

public interface LoanRequestServiceI {
	public void create(LoanRequest loanrequest);
	public List<LoanRequest> reterive();
	public LoanRequest findbyId(String id);
	public void delete(int id);

}

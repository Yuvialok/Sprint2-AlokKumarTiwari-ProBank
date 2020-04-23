package com.cg.dao;

import java.util.List;

import com.cg.entity.LoanRequest;



public interface LoanRequestDaoI {
	
	public void create(LoanRequest loanrequest);
	public List<LoanRequest> reterive();
	
	public LoanRequest findById(String id);
	
	public void delete(int id);
	
	public void update(int id);
	

}

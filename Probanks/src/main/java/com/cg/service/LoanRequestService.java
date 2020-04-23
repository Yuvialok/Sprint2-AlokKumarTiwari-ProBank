package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.LoanRequestDao;

import com.cg.entity.LoanRequest;


@Service
public class LoanRequestService implements LoanRequestServiceI {
	
	@Autowired
	LoanRequestDao loanrequestdao;
	
	@Override
	public void create(LoanRequest loanrequest) {
		loanrequestdao.create(loanrequest);
   }

	@Override
	public List<LoanRequest> reterive() {
		return loanrequestdao.reterive();
	}

	@Override
	public LoanRequest findbyId(String id) {
		return loanrequestdao.findById(id);
	}

	@Override
	public void delete(int id) {
		loanrequestdao.delete(id);
	}

}

package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.LoanRequest;
import com.cg.dao.LoanRequestDaoI;


@Repository("loanRepo")
@Transactional
public class LoanRequestDao implements LoanRequestDaoI {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(LoanRequest loanrequest) {
         em.persist(loanrequest);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanRequest> reterive() {
		Query q=em.createQuery(" Select from LoanRequest loanrequest");
		return q.getResultList();
	}

	@Override
	public LoanRequest findById(String id) {
		  
		return em.find(LoanRequest.class, id);
	}

	@Override
	public void delete(int id) {
	LoanRequest loanrequest=em.find(LoanRequest.class, id);
	System.out.println(loanrequest.getAccount_id() +" "+loanrequest.getAmount() +" "+loanrequest.getTenure() +" "+loanrequest.getCredit_score() +" "+loanrequest.getRoi() +" "+loanrequest.getLoan_type() +" "+loanrequest.getLoan_status());
	System.out.println("Is Removed");
	em.remove(loanrequest);
	
	}

	@Override
	public void update(int id) {
      LoanRequest loanrequest= em.find(LoanRequest.class, id);		
      loanrequest.setLoan_type("BusinessType");
      System.out.println("updated"); 
	}
	
}

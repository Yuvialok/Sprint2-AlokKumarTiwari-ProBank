package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.LoanRequestDao;
import com.cg.entity.LoanRequest;

@SpringBootApplication
public class ProbanksApplication implements CommandLineRunner {
	
	@Autowired
	LoanRequestDao loanrequestdao;

	public static void main(String[] args) {
		SpringApplication.run(ProbanksApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	/*	
	 LoanRequest loanrequest1 = new LoanRequest("100100010000",5000,24,800,8.5,"Personal loan","On Progress");
	 LoanRequest loanrequest2 = new LoanRequest("100100010001",5010,48,900,7.5,"Home loan","Pendig"); 
	 LoanRequest loanrequest3 = new LoanRequest("100100010002",5020,36,100,5.5,"Education loan","Document Verification pending"); 
	 LoanRequest loanrequest4 = new LoanRequest("100100010003",5030,24,12,9.5,"Business loan","Data Verification on Progress"); 
	 LoanRequest loanrequest5 = new LoanRequest("100100010004",5040,12,700,8.5,"Personal loan","On Progress"); 
	 LoanRequest loanrequest6 = new LoanRequest("100100010005",5050,60,500,2.5,"Vehicle loan","Record Verification Checking"); 
	 LoanRequest loanrequest7 = new LoanRequest("100100010006",5060,72,400,4.5,"Shop loan","On Progress"); 
	 LoanRequest loanrequest8 = new LoanRequest("100100010007",5070,24,16,3.5,"Treatment loan","Verifying Hospital Slips"); 
	 LoanRequest loanrequest9 = new LoanRequest("100100010008",5080,36,870,7.5,"Personal Loan","On Progress"); 
	 LoanRequest loanrequest10 = new LoanRequest("100100010009",5090,48,803,1.5,"Agricultural loan","Waiting for last Stamp"); 
		 
	 
		 loanrequestdao.create(loanrequest1);
		 loanrequestdao.create(loanrequest2);
		 loanrequestdao.create(loanrequest3);
		 loanrequestdao.create(loanrequest4);
		 loanrequestdao.create(loanrequest5);
		 loanrequestdao.create(loanrequest6);
		 loanrequestdao.create(loanrequest7);
		 loanrequestdao.create(loanrequest8);
		 loanrequestdao.create(loanrequest9);
		 loanrequestdao.create(loanrequest10);
		
		 
		 System.out.println("Record Inserted");  
		 
		 */
		 
		
		
		 LoanRequest loanrequest=loanrequestdao.findById("1000100010004"); 
		 System.out.println(loanrequest.getRoi() +" "+loanrequest.getCredit_score() +" "+
		 loanrequest.getAmount() + loanrequest.getLoan_type());
		 
		
		//loanRequest.delete(3);
		
		//loanrequest.update(4);
		
	}
		 
}




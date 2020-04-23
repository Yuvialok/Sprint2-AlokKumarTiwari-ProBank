package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="loan_request")
@DynamicUpdate(true)
@DynamicInsert(true)

public class LoanRequest {
	
	@Id
	@Column(name="account_id")
	@NotNull(message="Account ID is Mandatory")
	private String account_id;

		@Column(name="Amount")
		@NotNull(message="Amount is Mandatory")
		private double amount;
	
		@Column(name="Tenure_Time")
		@NotNull(message="TenureTime is Mandatory")
		private int tenure;
	
		@Column(name="credit_score")
		@NotNull(message="Credit_score is Mandatory")
		private int credit_score;
	
		@Column(name="RateOfIntrest")
		@NotNull(message="RateOfInterest is Mandatory")
		private double roi;
	
		@Column(name="Loan_Type")
		@NotNull(message="Type is Mandatory")
		private String loan_type;
		
		@Column(name="Loan_Status")
		@NotNull(message="Status is Mandatory")
	    private String loan_status;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="customerId")
	    private LoanDisbursement loan;
		
		public String getAccount_id() {
			return account_id;
		}
		public void setAccount_id(String account_id) {
			this.account_id = account_id;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public int getTenure() {
			return tenure;
		}
		public void setTenure(int tenure) {
			this.tenure = tenure;
		}
		public int getCredit_score() {
			return credit_score;
		}
		public void setCredit_score(int credit_score) {
			this.credit_score = credit_score;
		}
		public double getRoi() {
			return roi;
		}
		public void setRoi(double roi) {
			this.roi = roi;
		}
		public String getLoan_type() {
			return loan_type;
		}
		public void setLoan_type(String loan_type) {
			this.loan_type = loan_type;
		}
		public String getLoan_status() {
			return loan_status;
		}
		public void setLoan_status(String loan_status) {
			this.loan_status = loan_status;
		}
		
		public LoanRequest() {
			super();
		}
		public LoanRequest(@NotNull(message = "Account ID is Mandatory") String account_id,
				@NotNull(message = "Amount is Mandatory") double amount,
				@NotNull(message = "TenureTime is Mandatory") int tenure,
				@NotNull(message = "Credit_score is Mandatory") int credit_score,
				@NotNull(message = "RateOfInterest is Mandatory") double roi,
				@NotNull(message = "Type is Mandatory") String loan_type,
				@NotNull(message = "Status is Mandatory") String loan_status) {
			super();
			this.account_id = account_id;
			this.amount = amount;
			this.tenure = tenure;
			this.credit_score = credit_score;
			this.roi = roi;
			this.loan_type = loan_type;
			this.loan_status = loan_status;
		}   
		
}

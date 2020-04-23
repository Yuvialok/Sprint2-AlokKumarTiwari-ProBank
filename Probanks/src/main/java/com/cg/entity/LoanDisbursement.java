package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="loan_disburse")

public class LoanDisbursement {
	
	@Id
	@Column(name="CustomerId")
	@NotNull(message="CustomerID is Mandatory")
	private String CustomerId;
	
	@Column(name="FromAccountId")
	@NotNull(message="FromAccountId is Mandatory")
	private String FromAccountID;
	
	@Column(name="DisburseAmount")
	@NotNull(message="DisBursementAmount is Mandatory")
	private Double DisbursementAmount;
	
	@Column(name="Disbursement_Status")
	@NotNull(message="DisBursement status is Mandatory")
	private String DisbursementStatus;
	
	
	public LoanDisbursement() {
		super();
	}

	public String getCustomerId() 
	{
		return CustomerId;
	}
	
	public void setCustomerId(String customerId)
	{
		CustomerId = customerId;
	}
	
	public String getFromAccountID()
	{
		return FromAccountID;
	}
	
	public void setFromAccountID(String fromAccountID) 
	{
		FromAccountID = fromAccountID;
	}
	
	public Double getDisbursementAmount()
	{
		return DisbursementAmount;
	}
	
	public void setDisbursementAmount(Double disbursementAmount)
	{
		DisbursementAmount = disbursementAmount;
	}
	
	public String getDisbursementStatus()
	{
		return DisbursementStatus;
	}
	
	public void setDisbursementStatus(String disbursementStatus)
	{
		DisbursementStatus = disbursementStatus;
	}
	
	

	public LoanDisbursement(@NotNull(message = "CustomerID is Mandatory") String customerId,
			@NotNull(message = "FromAccountId is Mandatory") String fromAccountID,
			@NotNull(message = "DisBursementAmount is Mandatory") Double disbursementAmount,
			@NotNull(message = "DisBursement status is Mandatory") String disbursementStatus) {
		super();
		CustomerId = customerId;
		FromAccountID = fromAccountID;
		DisbursementAmount = disbursementAmount;
		DisbursementStatus = disbursementStatus;
	}

	@Override
	public String toString() {
		return "LoanDisbursement [CustomerId=" + CustomerId + ", FromAccountID=" + FromAccountID
				+ ", DisbursementAmount=" + DisbursementAmount + ", DisbursementStatus=" + DisbursementStatus + "]";
	}
	
	
	

}

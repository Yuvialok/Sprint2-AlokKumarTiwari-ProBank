package com.cg.entity;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class LoanDisbursement {
	
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
	
	
	

}

package com.LoanApplication.Loan.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentShedule {
   
	@Id
    @GeneratedValue(strategy =GenerationType.AUTO) 
	private int custScheduleId;
	private LocalDate paymentDate;
	private double principal;
	private double projectedIntrest;
	@Enumerated(EnumType.STRING)
	private Status status;
	private double paymentAmount;
	
	public PaymentShedule() {
		// TODO Auto-generated constructor stub
	}

	public PaymentShedule(int custScheduleId, LocalDate paymentDate, double principal, double projectedIntrest,
			Status status, double paymentAmount) {
		super();
		this.custScheduleId = custScheduleId;
		this.paymentDate = paymentDate;
		this.principal = principal;
		this.projectedIntrest = projectedIntrest;
		this.status = status;
		this.paymentAmount = paymentAmount;
	}
	//getetrs and setters

	public int getCustScheduleId() {
		return custScheduleId;
	}

	public void setCustScheduleId(int custScheduleId) {
		this.custScheduleId = custScheduleId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getProjectedIntrest() {
		return projectedIntrest;
	}

	public void setProjectedIntrest(double projectedIntrest) {
		this.projectedIntrest = projectedIntrest;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	
}

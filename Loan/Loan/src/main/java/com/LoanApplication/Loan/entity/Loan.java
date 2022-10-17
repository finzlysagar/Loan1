package com.LoanApplication.Loan.entity;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="Loan")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private double loanAmount;
	private LocalDate tradeDate;
	private LocalDate loanStartDate;
	private LocalDate maturityDate;
	private int paymentFrequency;
	private int tenure;
	private double interestRate;
	private String PaymentTerm;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="sheduleid")
	java.util.List<PaymentShedule> schedule;
	
	
	
	
	
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}
	
	public Loan(int customerId, double loanAmount, LocalDate tradeDate, LocalDate loanStartDate, LocalDate maturityDate,
			int paymentFrequency, int tenure, double interestRate, String paymentTerm) {
		super();
		this.customerId = customerId;
		this.loanAmount = loanAmount;
		this.tradeDate = tradeDate;
		this.loanStartDate = loanStartDate;
		this.maturityDate = maturityDate;
		this.paymentFrequency = paymentFrequency;
		this.tenure = tenure;
		this.interestRate = interestRate;
		PaymentTerm = paymentTerm;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public LocalDate getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(LocalDate tradeDate) {
		this.tradeDate = tradeDate;
	}

	public LocalDate getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(LocalDate loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public int getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(int paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getPaymentTerm() {
		return PaymentTerm;
	}

	public void setPaymentTerm(String paymentTerm) {
		PaymentTerm = paymentTerm;
	}

	
}

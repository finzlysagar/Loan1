package com.LoanApplication.Loan.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoanApplication.Loan.database.LoanDatabase;
import com.LoanApplication.Loan.entity.Loan;
import com.LoanApplication.Loan.entity.PaymentShedule;

@Service
public class LoanService {
	 Loan entity=new Loan();	
	   @Autowired 
	   private LoanDatabase loanDatabase;
	   @Autowired
	   private PayementSheduleService payementSheduleService;
	   
	  public List<Loan>showloans()
	  {
		return loanDatabase.findAll(); 
     	}
	  
	 

	public Loan genrateLone(Loan loan) {
		// TODO Auto-generated method stub
		loan.setTradeDate(LocalDate.now());
		loan.setLoanStartDate(LocalDate.now());
		
		loan.setMaturityDate(loan.getTradeDate().plusYears(loan.getTenure()));

		payementSheduleService.genrateSchedule(loan);
		return loanDatabase.save(loan);

		
	}
	
	   
	

}

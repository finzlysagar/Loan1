package com.LoanApplication.Loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LoanApplication.Loan.entity.Loan;
import com.LoanApplication.Loan.entity.PaymentShedule;
import com.LoanApplication.Loan.service.LoanService;
import com.LoanApplication.Loan.service.PayementSheduleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoanController {
	@Autowired
	private  LoanService loanService;
	@Autowired  
	private PayementSheduleService paymentSheduleService;
	 
	 @GetMapping("check")
	 public String abc()
	 {
		 return "I am Working bro...";
	 }
	@GetMapping("/showloans")
	     public List<Loan>showloans()
	     { 
		   System.out.println("ALL LOANS ARE PRINTED SUCCESSFULLY");
		       return loanService.showloans();
		 
	    }
	 
	@GetMapping("/showschedule")
	public List<PaymentShedule> scheduleList(){
		System.out.println("ALL PAYMENT SHEDULES ARE PRINTED SUCCESSFULLY");
		return  paymentSheduleService.showschedules();
		
	}
	@PostMapping("/genratelone")
	public Loan createLone(@RequestBody Loan loan) {
		System.out.println("Loan is created");
		return loanService.genrateLone(loan);
		 
	}
	
	 

}

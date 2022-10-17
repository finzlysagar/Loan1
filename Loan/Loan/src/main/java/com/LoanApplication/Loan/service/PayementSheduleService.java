package com.LoanApplication.Loan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoanApplication.Loan.database.PaymentSheduleDatabase;
import com.LoanApplication.Loan.entity.Loan;
import com.LoanApplication.Loan.entity.PaymentShedule;
import com.LoanApplication.Loan.entity.Status;

@Service
public class PayementSheduleService {

	 @Autowired
	 private PaymentSheduleDatabase paymentSheduleDatabase;
	 
	   public List<PaymentShedule>showschedules()
	   {
		   return paymentSheduleDatabase.findAll();
	    }
	  
	   public List<PaymentShedule>genrateSchedule(Loan loan){
			
			String paymentTerm="EVEN";
			List<PaymentShedule> scheduleList=new ArrayList<>();
			if(paymentTerm.equalsIgnoreCase(loan.getPaymentTerm())) {
				scheduleList=evenPrincipleLoan(loan);
			}else {
				scheduleList=interestPrincipleLoan(loan);
			}
			return scheduleList;
		}
	   
	   
	   //that 2 methos
	   //Even method
	   
	   public List<PaymentShedule> evenPrincipleLoan(Loan loan) {
			ArrayList<PaymentShedule> scheduleList = new ArrayList<>();
			int numberOfInstallments=(loan.getTenure()*loan.getPaymentFrequency());

			
			double principle =(loan.getLoanAmount()/loan.getPaymentFrequency());		
			
			for(int i=0;i<numberOfInstallments;i++) {
				
				double interest=((loan.getLoanAmount()-(principle*(i)))*loan.getInterestRate()*loan.getTenure())/(100*loan.getPaymentFrequency());

				PaymentShedule paymentShedule = new PaymentShedule();
				paymentShedule.setPaymentDate(loan.getLoanStartDate().plusMonths(12/loan.getPaymentFrequency()));
				paymentShedule.setProjectedIntrest(interest);
				paymentShedule.setPrincipal(principle);
				paymentShedule.setPaymentAmount(interest+principle);
				paymentShedule.setStatus(Status.Projected);
				paymentSheduleDatabase.save(paymentShedule);
				scheduleList.add(paymentShedule);
			}
			
			return scheduleList;
			
		}           
	   
	   //interest
	   
	   public List<PaymentShedule> interestPrincipleLoan(Loan loanEntity){
			
			List<PaymentShedule>scheduleList = new ArrayList<PaymentShedule>(); 
			
			int numberOfInstallments=(loanEntity.getTenure()*loanEntity.getPaymentFrequency());


			double principle =(loanEntity.getLoanAmount()/loanEntity.getPaymentFrequency());
	        double interest=((loanEntity.getLoanAmount()*loanEntity.getInterestRate()*loanEntity.getTenure())/(100*numberOfInstallments));
			
			

				for (int i=0;i<numberOfInstallments;i++)
				{
					
					if(i==numberOfInstallments-1) {
					
						PaymentShedule scheduleEntity =new PaymentShedule();
						scheduleEntity.setPaymentDate(loanEntity.getLoanStartDate().plusMonths(12/loanEntity.getPaymentFrequency()));
						scheduleEntity.setPrincipal(0);
						scheduleEntity.setProjectedIntrest(interest);
						scheduleEntity.setStatus(Status.Projected);
						scheduleEntity.setPaymentAmount(interest+loanEntity.getLoanAmount());
						paymentSheduleDatabase.save(scheduleEntity);
						scheduleList.add(scheduleEntity);
						//scheduleEntity.setPaymentDate(scheduleEntity.setPaymentDate(loanEntity.getLoanStartDate().plusMonths(loanEntity.getPaymentFrequency())));
						
					}else{
						PaymentShedule scheduleEntity =new PaymentShedule();
						scheduleEntity.setPaymentDate(loanEntity.getLoanStartDate().plusMonths(12/loanEntity.getPaymentFrequency()));
						scheduleEntity.setPrincipal(0);
						scheduleEntity.setProjectedIntrest(interest);
						scheduleEntity.setStatus(Status.Projected);
						scheduleEntity.setPaymentAmount(interest);
						paymentSheduleDatabase.save(scheduleEntity);
						scheduleList.add(scheduleEntity);
					}
					
					}
					
									
				
			return scheduleList;
		}
		
	   
	   
	   
}

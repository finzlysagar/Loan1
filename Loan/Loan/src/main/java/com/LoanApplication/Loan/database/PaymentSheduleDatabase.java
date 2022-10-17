package com.LoanApplication.Loan.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanApplication.Loan.entity.PaymentShedule;

public interface PaymentSheduleDatabase  extends JpaRepository<PaymentShedule, Integer>{

}

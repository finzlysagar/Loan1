package com.LoanApplication.Loan.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoanApplication.Loan.entity.Loan;

@Repository
public interface LoanDatabase extends JpaRepository<Loan, Integer> {

}

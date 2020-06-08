package com.Ebanking.service;

import java.security.Principal;

import com.Ebanking.domain.PrimaryAccount;
import com.Ebanking.domain.SavingsAccount;

public interface AccountService {
	
    PrimaryAccount createPrimaryAccount();
    
    SavingsAccount createSavingsAccount();
    
    void deposit(String accountType, double amount, Principal principal);
    
    void withdraw(String accountType, double amount, Principal principal);
    
}

package com.Ebanking.dao;

import org.springframework.data.repository.CrudRepository;

import com.Ebanking.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}

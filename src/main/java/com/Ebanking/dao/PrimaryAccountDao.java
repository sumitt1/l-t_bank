package com.Ebanking.dao;

import org.springframework.data.repository.CrudRepository;

import com.Ebanking.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}

package com.cloud.bank.impl;

import com.jmp.bank.api.BankImpl;
import com.jmp.bank.api.enums.BankCardType;
import com.jmp.dto.BankCard;
import com.jmp.dto.User;


public class Bank implements BankImpl {


    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        return bankCardType.bankCard.apply(user);


    }
}
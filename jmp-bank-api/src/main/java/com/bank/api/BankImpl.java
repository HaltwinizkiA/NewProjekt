package com.bank.api;


import com.dto.BankCard;
import com.dto.User;
import com.enums.BankCardType;

public interface BankImpl {
    BankCard createBankCard(User user, BankCardType bankCardType);
}

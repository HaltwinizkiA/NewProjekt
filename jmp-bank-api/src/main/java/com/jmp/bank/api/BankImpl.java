package com.jmp.bank.api;


import com.jmp.dto.BankCard;
import com.jmp.dto.User;
import com.jmp.dto.BankCardType;

public interface BankImpl {
    BankCard createBankCard(User user, BankCardType bankCardType);
}

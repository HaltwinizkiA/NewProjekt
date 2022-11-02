package com.jmp.bank.api;


import com.jmp.bank.api.enums.BankCardType;
import com.jmp.dto.BankCard;
import com.jmp.dto.User;

public interface BankImpl {
    BankCard createBankCard(User user, BankCardType bankCardType);
}

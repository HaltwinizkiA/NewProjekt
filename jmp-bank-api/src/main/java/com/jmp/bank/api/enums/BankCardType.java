package com.jmp.bank.api.enums;

import com.jmp.dto.BankCard;
import com.jmp.dto.CreditBankCard;
import com.jmp.dto.DebitBankCard;
import com.jmp.dto.User;


import java.util.function.Function;

public enum BankCardType {
    CREDIT(CreditBankCard::new),
    DEBIT(DebitBankCard::new);


    public Function<User, BankCard> bankCard;

    BankCardType(Function<User, BankCard> bankCard) {
        this.bankCard = bankCard;
    }
}

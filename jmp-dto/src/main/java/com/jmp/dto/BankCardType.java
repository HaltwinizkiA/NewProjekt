package com.jmp.dto;

import java.util.function.Function;

public enum BankCardType {
    CREDIT(CreditBankCard::new),
    DEBIT(DebitBankCard::new);


    public Function<User, BankCard> bankCard;

    BankCardType(Function<User, BankCard> bankCard) {
        this.bankCard = bankCard;
    }
}

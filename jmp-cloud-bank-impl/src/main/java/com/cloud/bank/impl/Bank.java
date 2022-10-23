package com.cloud.bank.impl;

import com.bank.api.BankImpl;
import com.dto.BankCard;
import com.dto.CreditBankCard;
import com.dto.DebitBankCard;
import com.dto.User;
import com.enums.BankCardType;

public class Bank implements BankImpl {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {

        BankCard bankCard = new BankCard();
        switch (bankCardType) {
            case CREDIT:
                bankCard = new CreditBankCard();
            case DEBIT:
                bankCard = new DebitBankCard();
                break;
        }
        bankCard.setUser(user);

        return bankCard;


//        TODO: 23.10.2022

    }
}

package com.jmp.application;

import com.cloud.bank.impl.Bank;
import com.jmp.bank.api.enums.BankCardType;
import com.jmp.dto.User;

public class Main {
        public static void main(String[] args) {

            Bank bank=new Bank();
            System.out.println(  bank.createBankCard(new User(), BankCardType.CREDIT));
            System.out.println(  bank.createBankCard(new User(), BankCardType.DEBIT));
        }
    }


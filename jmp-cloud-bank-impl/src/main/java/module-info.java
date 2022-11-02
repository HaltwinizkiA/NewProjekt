
module jmp.cloud.bank.impl {
    provides com.jmp.bank.api.BankImpl  with com.cloud.bank.impl.Bank;
    requires com.jmp.bank.api;
    requires com.jmp.dto;
    exports com.cloud.bank.impl;

}
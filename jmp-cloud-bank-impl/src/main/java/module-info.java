
module jmp.cloud.bank.impl {
    requires com.jmp.dto;
    requires com.jmp.bank.api;
    provides com.jmp.bank.api.BankImpl  with com.cloud.bank.impl.Bank;
    exports com.cloud.bank.impl;

}
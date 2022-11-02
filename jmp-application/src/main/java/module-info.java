
module com.jmp.application {
//    uses ServiceImpl;
//    uses BankImpl;
    requires com.jmp.bank.api;
    requires com.service.api;
    requires jmp.cloud.bank.impl;
    requires com.jmp.dto;

}
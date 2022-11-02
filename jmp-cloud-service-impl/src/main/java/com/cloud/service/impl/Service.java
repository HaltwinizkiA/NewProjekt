package com.cloud.service.impl;

import com.jmp.dto.BankCard;
import com.jmp.dto.Subscription;
import com.jmp.dto.User;
import com.service.api.ServiceImpl;
import com.cloud.service.impl.exceptions.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Service implements ServiceImpl {
    @Override
    public void subscribe(BankCard bankCard) {

    }


    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber) {
        return Optional.of(getAllSubscriptions().stream().filter(subscription -> subscription.getBankcard().equals(bankCardNumber)).findFirst().orElseThrow(()->new NotFoundSubscriptionException("keine Subscription")));
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return null;
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate) {

        return getAllSubscriptions().stream().filter(predicate).collect(Collectors.toList());
    }
}

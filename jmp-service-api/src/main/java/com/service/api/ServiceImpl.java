package com.service.api;

import com.jmp.dto.BankCard;
import com.jmp.dto.Subscription;
import com.jmp.dto.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface ServiceImpl {
    void subscribe(BankCard bankCard );
    Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber);
    List<User> getAllUsers();
    List<Subscription> getAllSubscriptions();
    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> predicate);
   default double getAverageUsersAge(){
       return getAllUsers().stream().mapToLong(user ->
               ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now())).sum();
   }
   static boolean isPayableUser(User user){
       return ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()) >= 18;
   }
}

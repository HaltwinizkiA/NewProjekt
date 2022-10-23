package com.service.api;

import com.dto.BankCard;
import com.dto.User;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;

public interface ServiceImpl {
    void subscribe(BankCard bankCard );
    List<User> getAllUsers();
   default double getAverageUsersAge(){
       return getAllUsers().stream().mapToLong(user ->
               ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now())).sum()
               /getAllUsers().size();
   }
   static boolean isPayableUser(User user){
       return ChronoUnit.YEARS.between(user.getBirthday(), LocalDate.now()) >= 18;
   }
}

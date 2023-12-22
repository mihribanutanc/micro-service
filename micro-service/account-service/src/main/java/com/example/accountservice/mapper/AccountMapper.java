package com.example.accountservice.mapper;

import com.example.accountservice.dto.AccountDto;
import com.example.accountservice.entity.Account;
public interface AccountMapper {

    AccountDto toDto(Account account);
    Account toEntity(AccountDto accountDto);
}

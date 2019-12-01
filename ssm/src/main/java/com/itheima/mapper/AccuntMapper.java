package com.itheima.mapper;

import com.itheima.domain.Account;

import java.util.List;

public interface AccuntMapper {
    public void save(Account account);
    public List<Account> findAll();
}

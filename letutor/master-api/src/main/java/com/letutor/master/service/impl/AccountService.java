package com.letutor.master.service.impl;

import com.letutor.master.dto.request.CreateAccountRequest;
import com.letutor.master.dto.response.CreateAccountResponse;
import com.letutor.master.service.IAccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {

  @Override
  public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest) {
    return null;
  }
}

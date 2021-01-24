package com.letutor.master.service;

import com.letutor.master.dto.request.CreateAccountRequest;
import com.letutor.master.dto.response.CreateAccountResponse;

public interface IAccountService {
  CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest);
}

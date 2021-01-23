package com.letutor.master.controller;

import com.letutor.master.dto.request.CreateAccountRequest;
import com.letutor.master.dto.response.CreateAccountResponse;
import com.letutor.master.service.IAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/account")
public class AccountController {

  private final IAccountService accountService;

  public AccountController(IAccountService accountService) {
    this.accountService = accountService;
  }

  @PostMapping(value = "/create")
  public CreateAccountResponse createAccount(@RequestBody CreateAccountRequest createAccountRequest) {
    return accountService.createAccount(createAccountRequest);
  }
}

package com.letutor.master.service;

import com.letutor.master.core.dao.entity.User;
import com.letutor.master.dto.request.CreateAccountRequest;
import com.letutor.master.dto.response.UserDetailsResponse;

public interface IUserService {
  UserDetailsResponse getUserDetails(String userId);
  UserDetailsResponse createUser(CreateAccountRequest createAccountRequest);
}

package com.letutor.master.service;

import com.letutor.master.dto.response.UserDetailsResponse;

public interface IUserService {
  UserDetailsResponse getUserDetails(String userId);
}

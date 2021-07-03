package com.letutor.master.service.impl;

import com.letutor.master.core.dao.entity.User;
import com.letutor.master.core.dao.repository.IUserDao;
import com.letutor.master.dto.request.CreateAccountRequest;
import com.letutor.master.dto.response.UserDetailsResponse;
import com.letutor.master.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

  @Autowired
  private IUserDao userDao;
  @Override
  public UserDetailsResponse getUserDetails(String userId) {
    UserDetailsResponse response = new UserDetailsResponse();
    response.setUser(userDao.findById(userId).get());
    return response;
  }

  @Override
  public UserDetailsResponse createUser(CreateAccountRequest createAccountRequest) {
    User user = User.builder().contact(createAccountRequest.getContact())
        .email(createAccountRequest.getEmail())
        .firstName(createAccountRequest.getFirstName())
        .lastName(createAccountRequest.getLastName())
        .pinCode(createAccountRequest.getPinCode())
        .build();
    user = userDao.save(user);
    UserDetailsResponse response = new UserDetailsResponse();
    response.setUser(user);
    return  response;
  }


}

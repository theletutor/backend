package com.letutor.master.controller.v1;

import com.letutor.master.dto.request.CreateAccountRequest;
import com.letutor.master.dto.response.UserDetailsResponse;
import com.letutor.master.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

  private final IUserService userService;

  public UserController(IUserService userService){
    this.userService = userService;
  }

  @GetMapping(value = "/{id}")
  public UserDetailsResponse getUserDetails(@PathVariable String id){
    return userService.getUserDetails(id);
  }

  @PostMapping
  public UserDetailsResponse createUser(@RequestBody CreateAccountRequest createAccountRequest){
    return userService.createUser(createAccountRequest);
  }
}

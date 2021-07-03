package com.letutor.master.dto.request;

import lombok.Data;

@Data
public class CreateAccountRequest {
  private String firstName;
  private String lastName;
  private String email;
  private Integer contact;
  private Integer pinCode;
}

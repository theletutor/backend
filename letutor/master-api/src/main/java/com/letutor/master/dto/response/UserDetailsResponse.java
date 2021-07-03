package com.letutor.master.dto.response;

import com.letutor.master.core.dao.entity.User;
import lombok.Data;

@Data
public class UserDetailsResponse {
  private User user;

}

package com.letutor.master.core.dao.repository;

import com.letutor.master.core.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, String> {

}

package com.letutor.master.config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.letutor.master.core.dao.repository"})
public class DbConfig {

}

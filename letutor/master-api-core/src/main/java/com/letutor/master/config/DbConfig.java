package com.letutor.master.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.letutor.master.core.dao.repository"})
public class DbConfig {

}

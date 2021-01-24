package com.letutor.master.core.dao.repository;

import com.letutor.master.core.dao.entity.Tutor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITutorDao extends MongoRepository<Tutor, String> {
}

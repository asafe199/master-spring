package com.master.project.dao.respository;

import com.master.project.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends MongoRepository<User, String> {

}

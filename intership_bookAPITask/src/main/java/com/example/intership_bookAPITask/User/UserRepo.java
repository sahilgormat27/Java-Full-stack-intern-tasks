package com.example.intership_bookAPITask.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserEntries,String> {
}

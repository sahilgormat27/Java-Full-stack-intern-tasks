package com.example.intership_bookAPITask.book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookRepo extends MongoRepository<BookEntries,String> {

}
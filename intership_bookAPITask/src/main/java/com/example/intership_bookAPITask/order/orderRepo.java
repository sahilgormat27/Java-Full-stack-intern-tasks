package com.example.intership_bookAPITask.order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface orderRepo extends MongoRepository<OrderEntries,String> {
}

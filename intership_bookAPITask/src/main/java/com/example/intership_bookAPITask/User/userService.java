package com.example.intership_bookAPITask.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class userService {
    @Autowired
    private UserRepo UserRepo;

    public void saveuser(UserEntries myuserEntries) {
        UserRepo.save(myuserEntries);
    }
    public List<UserEntries> showAllUsers(){
        return UserRepo.findAll();
    }
   }
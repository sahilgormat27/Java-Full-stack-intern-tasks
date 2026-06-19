package com.example.intership_bookAPITask.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class userController {
    @Autowired
    userService userService;
    @PostMapping("/AddUser")
    public void Adduser(@RequestBody UserEntries userEntries ){
        userService.saveuser(userEntries);
    }
    @GetMapping("/Allusers")
    public List<UserEntries> getAll(){
        return userService.showAllUsers();
    }
}

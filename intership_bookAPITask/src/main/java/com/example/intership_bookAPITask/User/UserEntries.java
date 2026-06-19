package com.example.intership_bookAPITask.User;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "UserEntries")
public class UserEntries {
    @Id
    private String username;
    private String email;
    private String Password;
    private String Role;
}

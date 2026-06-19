package com.example.intership_bookAPITask.order;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "OrderEntries")
public class OrderEntries {
    @Id
    private String  Id;
    private String  Cname;
    private String  Email;
    private String orderedBook;
    private String Status;

}

package com.example.intership_bookAPITask.book;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "BookEntries")
public class BookEntries {
    @Id
    private String id;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private Double price;
    private Integer stock;
}

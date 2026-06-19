package com.example.intership_bookAPITask.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Books")
public class bookController {
    @Autowired
    public  bookServices bookServices;
    @PostMapping("/Add")
    public void AddBook(@RequestBody BookEntries myEntries) {
        bookServices.savebookEntries(myEntries);
    }
    @GetMapping("/AllBooks")
    public List<BookEntries>getall() {
        return bookServices.showAllBooks();
    }
    @GetMapping("/id/{myid}")
    public BookEntries getbyid(@PathVariable String myid){
        return bookServices.getByid(myid);
    }
    @DeleteMapping("/delete/{myid}")
    public void deletebyID(@PathVariable("myid") String myID){
          bookServices.deleteByid(myID);
    }
    @PutMapping("/update/{id}")
    public BookEntries updateBook(
            @PathVariable String id,
            @RequestBody BookEntries book) {

        return bookServices.updateBook(id, book);
    }
}

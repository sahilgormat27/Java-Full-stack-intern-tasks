package com.example.intership_bookAPITask.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class bookServices {
@Autowired
    private bookRepo bookRepo;
    public void savebookEntries(BookEntries mybookEntries){
        bookRepo.save(mybookEntries);
    }
    public List<BookEntries> showAllBooks(){
       return bookRepo.findAll();
    }
    public BookEntries getByid(String myid){
       return bookRepo.findById(myid).orElse(null);
    }
    public void deleteByid(String myid){
       bookRepo.deleteById(myid);
    }

    public BookEntries updateBook(String id, BookEntries updatedBook) {

        BookEntries existingBook = bookRepo.findById(id).orElse(null);

        if (existingBook != null) {

            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setGenre(updatedBook.getGenre());
            existingBook.setIsbn(updatedBook.getIsbn());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setStock(updatedBook.getStock());

            return bookRepo.save(existingBook);
        }

        return null;
    }
}

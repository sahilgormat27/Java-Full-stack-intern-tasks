package com.example.intership_bookAPITask.order;

import com.example.intership_bookAPITask.book.BookEntries;
import com.example.intership_bookAPITask.book.bookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    public OrderServices orderServices;
    public OrderController(OrderServices orderServices){
        this.orderServices=orderServices;
    }
    @PostMapping
    public OrderEntries placeOrder(@RequestBody OrderEntries myEntries) {
       return orderServices.saveorder(myEntries);
    }
    @GetMapping
    public List<OrderEntries> getallOrder() {
        return orderServices.getAllorder();
    }
    @GetMapping("/{id}")
    public OrderEntries getOrder(@PathVariable String id){
        return orderServices.getOderbyid(id);
    }
    @PutMapping("/{id}/status")
    public OrderEntries updatestatus(
            @PathVariable String id,
            @RequestParam String Status) {
        return orderServices.updateorder(id, Status);
    }



}

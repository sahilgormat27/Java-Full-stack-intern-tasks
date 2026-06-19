package com.example.intership_bookAPITask.order;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServices {
    private  orderRepo orderRepo;
    public OrderServices (orderRepo orderRepo ){
        this.orderRepo=orderRepo;
    }
    public OrderEntries saveorder(OrderEntries orderEntries){
        orderEntries.setStatus ("pending");
        return orderRepo.save(orderEntries);
    }
    public List<OrderEntries> getAllorder(){
        return orderRepo.findAll();
    }
    public OrderEntries getOderbyid(String id){
        return orderRepo.findById(id).orElseThrow(()-> new RuntimeException("Order not found"));
    }
    public OrderEntries updateorder(String id,String Status){
        OrderEntries orderEntries=getOderbyid(id);
        orderEntries.setStatus(Status);
        return orderRepo.save(orderEntries);
    }
}

package com.example.demo.controller;

import com.example.demo.model.People;
import com.example.demo.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    SumService service;

    @Autowired
    public MyController(SumService service) {
        this.service = service;
    }

    @GetMapping("list/")
    public String text(){
        return "Hello World!";
    }

    @GetMapping("sum/")
    public String sum() {
        return service.SumService();
    }

    @GetMapping("people/")
    public People getPeople() {
        People woman = new People("Макарова", "Ольга", 28);
        return woman;
    }
}
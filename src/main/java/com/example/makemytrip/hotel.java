package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel{
    @GetMapping("/hotel")
    public String getData() {return "book your oyo hotel in the state of maharashtra specially in pune nagpur" ;}
}